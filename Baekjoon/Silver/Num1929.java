package Baekjoon.Silver;
/*M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.*/

import java.util.Scanner;

public class Num1929 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int M = scan.nextInt();
        int N = scan.nextInt();
        scan.close();

        for (int i = M; i <= N; i++) {

            if (i == 2 || i == 3) {
                System.out.println(i);
                continue;
            }
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    break;
                } else if (j == (int) Math.sqrt(i)) {
                    System.out.println(i);
                }
            }
        }
    }
}
