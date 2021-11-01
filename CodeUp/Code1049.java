package CodeUp;

import java.util.Scanner;

public class Code1049 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        //삼항연산자 사용
        System.out.println(a>b?1:0);
    }
}
