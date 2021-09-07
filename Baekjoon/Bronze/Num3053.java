package Baekjoon.Bronze;
/* 택시 기하학 */

import java.util.Scanner;

public class Num3053 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        scan.close();
        double circleWidth = r * r * Math.PI;

        double taxiWidth = 2* (r*r);
        System.out.printf("%.6f%n", circleWidth);
        System.out.printf("%.6f%n", taxiWidth);
    }
}
