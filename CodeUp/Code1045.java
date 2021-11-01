package CodeUp;

import java.util.Scanner;

public class Code1045 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        long b = scan.nextLong();
        //합
        System.out.println(a+b);
        //차
        System.out.println(a-b);
        //곱
        System.out.println(a*b);
        //몫
        System.out.println(a/b);
        //나머지
        System.out.println(a%b);
        //소숫점 출력
        System.out.printf("%.2f", (float) a/b);
    }
}
