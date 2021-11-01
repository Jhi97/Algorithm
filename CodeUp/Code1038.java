package CodeUp;

import java.util.Scanner;

public class Code1038 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //int 형 범위를 넘어가는 테스트 케이스에 대해 long 형 선언
        long a = scan.nextInt();
        long b = scan.nextInt();
        long sum = a+b;
        System.out.println(sum);
    }
}
