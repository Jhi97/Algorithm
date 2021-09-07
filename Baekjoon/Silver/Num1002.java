package Baekjoon.Silver;
/*이석원은 조규현과 백승환에게 상대편 마린(류재명)의 위치를 계산하라는 명령을 내렸다.
 조규현과 백승환은 각각 자신의 터렛 위치에서 현재 적까지의 거리를 계산했다.

조규현의 좌표 (x1, y1)와 백승환의 좌표 (x2, y2)가 주어지고,
조규현이 계산한 류재명과의 거리 r1과 백승환이 계산한 류재명과의 거리 r2가 주어졌을 때,
류재명이 있을 수 있는 좌표의 수를 출력하는 프로그램을 작성하시오.*/

import java.util.Scanner;

public class Num1002 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while (T > 0) {
            int x1 = scan.nextInt();
            int y1 = scan.nextInt();
            int r1 = scan.nextInt();

            int x2 = scan.nextInt();
            int y2 = scan.nextInt();
            int r2 = scan.nextInt();

            System.out.println(point(x1, y1, r1, x2, y2, r2));
            T--;
        }
    }

    public static int point(int x1, int y1, int r1, int x2, int y2, int r2) {

        //두 터렛 사이의 거리
        int distance = (int) (Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

        //두 터렛이 일치
        if (x1 == x2 && y1 == y2 && r1 == r2) {
            return -1;
        }
        //반지름 합보다 터렛간 거리가 멈
        else if (distance > Math.pow(r1 + r2, 2)) {
            return 0;
        }
        //내접하지 않음
        else if (distance < Math.pow(r1 - r2, 2)) {
            return 0;
        }
        //두 터렛이 외접함
        else if (distance == Math.pow(r1 + r2, 2)) {
            return 1;
        }
        //두 터렛이 내접함
        else if (distance == Math.pow(r1 - r2, 2)) {
            return 1;
        }

        else
            return 2;
    }
}
