package Baekjoon;
/*과거 이집트인들은 각 변들의 길이가 3, 4, 5인 삼각형이 직각 삼각형인것을 알아냈다.
주어진 세변의 길이로 삼각형이 직각인지 아닌지 구분하시오.*/

import java.util.Arrays;
import java.util.Scanner;

public class Num4153 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int[] input = new int[3];
            for (int i = 0; i < 3; i++) {
                input[i] = scan.nextInt();
            }
            //0 0 0 입력 확인
            if(input[0] == input[1] && input[0] == input[2] && input[0] == 0){
                break;
            }
            //배열 정렬
            Arrays.sort(input);
            int hap = (int) Math.sqrt((input[0]*input[0]) + (input[1]*input[1]));

            if (input[2] == hap) {
                System.out.println("right");
            }else {
                System.out.println("wrong");
            }
        }
    }
}
