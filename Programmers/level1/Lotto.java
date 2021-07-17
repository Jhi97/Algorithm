package Programmers.level1;

/* https://programmers.co.kr/learn/courses/30/lessons/77484 */

class Solution_Lotto {
    public int[] solution(int[] lottos, int[] win_nums) {
        int Score=0;
        int MaxScore=0;
        int zeroCnt=0;
        int count=0;
        for(int i=0; i<lottos.length; i++){
            if(lottos[i]==0){
                zeroCnt++;
            }else if(lottos[i]!=0){
                for(int j=0; j<win_nums.length; j++){
                    if(lottos[i] == win_nums[j]){
                        count++;
                    }
                }
            }
        }
        switch (count){
            case 6: Score=1;
                break;
            case 5: Score=2;
                break;
            case 4: Score=3;
                break;
            case 3: Score=4;
                break;
            case 2: Score=5;
                break;
            default: Score=6;
                break;
        }
        zeroCnt= zeroCnt + count;
        switch (zeroCnt){
            case 6: MaxScore=1;
                break;
            case 5: MaxScore=2;
                break;
            case 4: MaxScore=3;
                break;
            case 3: MaxScore=4;
                break;
            case 2: MaxScore=5;
                break;
            default: MaxScore=6;
                break;
        }

        int[] answer = {MaxScore, Score};
        return answer;
    }
}

class Lotto {
}
