package Programmers.level1;

/*이 전화 키패드에서 왼손과 오른손의 엄지손가락만을 이용해서 숫자만을 입력하려고 합니다.
맨 처음 왼손 엄지손가락은 * 키패드에 오른손 엄지손가락은 # 키패드 위치에서 시작하며,
엄지손가락을 사용하는 규칙은 다음과 같습니다.

엄지손가락은 상하좌우 4가지 방향으로만 이동할 수 있으며 키패드 이동 한 칸은 거리로 1에 해당합니다.
왼쪽 열의 3개의 숫자 1, 4, 7을 입력할 때는 왼손 엄지손가락을 사용합니다.
오른쪽 열의 3개의 숫자 3, 6, 9를 입력할 때는 오른손 엄지손가락을 사용합니다.
가운데 열의 4개의 숫자 2, 5, 8, 0을 입력할 때는 두 엄지손가락의 현재 키패드의 위치에서 더 가까운 엄지손가락을 사용합니다.
4-1. 만약 두 엄지손가락의 거리가 같다면, 오른손잡이는 오른손 엄지손가락, 왼손잡이는 왼손 엄지손가락을 사용합니다.
순서대로 누를 번호가 담긴 배열 numbers, 왼손잡이인지 오른손잡이인 지를 나타내는 문자열 hand가 매개변수로 주어질 때,
각 번호를 누른 엄지손가락이 왼손인 지 오른손인 지를 나타내는 연속된 문자열 형태로 return 하도록 solution 함수를 완성해주세요.*/


class Solution_Keypad {
    public String solution(int[] numbers, String hand) {
        String answer="";
        int[] leftHand = {3,0};
        int[] rightHand = {3,2};
        int[] tempHand = new int[2];
        int leftDistance, rightDistance;

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==1 || numbers[i]==4 || numbers[i]==7){
                leftHand = moveHand(numbers[i]);
                answer += "L";
                continue;
            }else if(numbers[i]==3 || numbers[i]==6 || numbers[i]==9){
                rightHand = moveHand(numbers[i]);
                answer += "R";
                continue;
            }else{
                tempHand = moveHand(numbers[i]);
                leftDistance = Math.abs(tempHand[0]-leftHand[0]) + Math.abs(tempHand[1]-leftHand[1]);
                rightDistance = Math.abs(tempHand[0]-rightHand[0]) + Math.abs(tempHand[1]-rightHand[1]);

                if(leftDistance > rightDistance){
                    rightHand = tempHand;
                    answer += "R";
                } else if (leftDistance < rightDistance) {
                    leftHand = tempHand;
                    answer += "L";
                } else{
                    if(hand.equals("right")){
                        rightHand = tempHand;
                        answer += "R";
                    }else if(hand.equals("left")){
                        leftHand = tempHand;
                        answer += "L";
                    }
                }
            }
        }
        return answer;
    }

    private int[] moveHand(int num){
        int[][] keypad = {{1,2,3}, {4,5,6}, {7,8,9}, {-1,0,-2}};
        int[] temp = new int[2];
        for(int i=0; i<keypad.length; i++){
            for(int j=0; j<keypad[i].length; j++){
                if(keypad[i][j]==num)
                    temp = new int[]{i, j};
            }
        }
        return temp;
    }
}

public class Keypad {
    public static void main(String[] args) {
        Solution_Keypad sol = new Solution_Keypad();
        int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String hand = "left";
        System.out.println(sol.solution(numbers, hand));
    }
}
/*
70 8283  15762
LR       RLLRR
LRLLRRLLLRR
LRLLRRLLLRR*/
