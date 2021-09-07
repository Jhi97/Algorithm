package Baekjoon.Bronze;
/*N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.*/

import java.util.Scanner;

public class Num11720 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        String num = scan.nextLine();
        String[] split = num.split("");
        int[] intSplit = new int[split.length];
        int sum = 0;

        for (int i = 0; i < split.length; i++) {
            intSplit[i] = Integer.parseInt(split[i]);
        }
        for (int i : intSplit) {
            sum += i;
        }
        System.out.println(sum);
    }
}
