package Baekjoon.Bronze;
/*0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.*/

import java.util.Scanner;

public class Num10872 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
//        int result = 1;
//        while (N >= 1) {
//            result *= N;
//            N--;
//        }
//        System.out.println(result);
        int result = factorial(N);
        System.out.println(result);
    }

    public static int factorial (int N) {
        if (N <= 1) return 1;
        return N * factorial(N-1);
    }
}
