package Baekjoon;

import java.util.Scanner;

/*세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.

예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이 되고,
 계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.*/
public class Num2577 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A, B, C;
        int a = 0;int b = 0;int c = 0;int d = 0;int e = 0;int f = 0;int g = 0;
        int h = 0;int i = 0;int j = 0;
        A = scan.nextInt();
        B = scan.nextInt();
        C = scan.nextInt();
        String mul = String.valueOf(A*B*C);
        String[] split = mul.split("");

        for (int z = 0; z < split.length; z++) {
            int num = Integer.parseInt(split[z]);
            switch (num) {
                case 0: a++; break;
                case 1: b++; break;
                case 2: c++; break;
                case 3: d++; break;
                case 4: e++; break;
                case 5: f++; break;
                case 6: g++; break;
                case 7: h++; break;
                case 8: i++; break;
                case 9: j++; break;
            }
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
    }
}
