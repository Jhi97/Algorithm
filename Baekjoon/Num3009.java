package Baekjoon;
/*세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.*/

import java.util.Scanner;

public class Num3009 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x, y;
        int[] xArray = new int[3];
        int[] yArray = new int[3];
        for (int i = 0; i < 3; i++) {
            xArray[i] = scan.nextInt();
            yArray[i] = scan.nextInt();
        }
        scan.close();

        if (xArray[0] == xArray[1]) {
            x = xArray[2];
        }else if (xArray[0] == xArray[2]) {
            x = xArray[1];
        }else {
            x = xArray[0];
        }

        if (yArray[0] == yArray[1]) {
            y = yArray[2];
        }else if (yArray[0] == yArray[2]) {
            y = yArray[1];
        }else {
            y = yArray[0];
        }

        System.out.println(x + " " + y);
    }
}
