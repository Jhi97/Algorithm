package Programmers.level1;

/*수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.*/

class Solution_MockTest{
    public int[] solution(int[] answers){
        int one=0, two=0, three=0;
        int[] answer={};
        //1번 수포자
        one = answerComp(answers, setSupo1(answers.length));
        //2번 수포자
        two = answerComp(answers, setSupo2(answers.length));
        //3번 수포자
        three = answerComp(answers, setSupo3(answers.length));
        int max = maxVal(one, two, three);

        if(max == one){
            if(max == two || max == three) {
                if(max == two && max == three){
                    answer = new int[] {1,2,3};
                }else if(max == two){
                    answer = new int[] {1,2};
                }else if(max == three){
                    answer = new int[] {1,3};
                }
            }else{
                answer = new int[] {1};
            }
        }else if (max == two){
            if(max == three){
                answer = new int[] {2,3};
            }else{
                answer = new int[] {2};
            }
        }else if (max == three){
            answer = new int[] {3};
        }
        return answer;
    }
    public int[] setSupo1(int length){
        int num = 1;
        if(length>10000){
            length=10000;
        }
        int[] supo1 = new int[length];
        for(int index=0; index<length; index++){
            supo1[index] = num;
            if(num==5) {
                num = 1;
            }else{
                num++;
            }
        }
        return  supo1;
    }

    public int[] setSupo2(int length){
        int fixNum = 2;
        int num = 1;
        if(length>10000){
            length=10000;
        }
        int[] supo2 = new int[length];
        for(int index=0; index<length; index++){
            if(index%2==0){
                supo2[index] = fixNum;
            }else{
                supo2[index] = num;
                num++;
                if(num==2) {
                    num = 3;
                }else if(num==6){
                    num = 1;
                }
            }
        }
        return supo2;
    }
    public int[] setSupo3(int length){
        int num = 3;
        int cnt =0;
        if(length>10000){
            length=10000;
        }
        int[] supo3 = new int[length];
        for(int index=0; index<length; index++){
            if(index%10==0){
                num = 3;
                supo3[index] = num;
                cnt = 1;
            }else{
                if(cnt==0){
                    supo3[index] = num;
                    cnt = 1;
                }else if(cnt==1){
                    supo3[index] = num;
                    if(num==2){
                        num=4;
                    }
                    else if(num==3){
                        num=1;
                    }else if(num==6){
                        num=3;
                    }else{
                        num++;
                    }
                    cnt--;
                }
            }
        }
        return supo3;
    }
    public int answerComp(int[] answers, int[] comp){
        int answerCount = 0;
        for(int i =0; i<answers.length; i++){
            if(answers[i] == comp[i])
                answerCount++;
        }
        return answerCount;
    }
    public int maxVal(int one, int two, int three){
        int temp = 0;
        if(one>=two && one>=three){
            temp = one;
        }else if(two>=one && two>=three){
            temp = two;
        }else if(three>=one && three>= two){
            temp = three;
        }
        return temp;
    }
}



class MockTest {
}
