package Baekjoon;
/*주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.*/

import java.util.Scanner;

public class Num1978 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            int num = scan.nextInt();
            if(num < 2){
                continue;
            }else if(num == 2 || num == 3){
                cnt++;
                continue;
            }
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if(num % j == 0) {
                    break;
                }else if(j == (int) Math.sqrt(num)){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
