package Baekjoon.Bronze;
/*두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.*/

import java.math.BigInteger;
import java.util.Scanner;

public class Num10757 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger A = new BigInteger(scan.next());
        BigInteger B = new BigInteger(scan.next());
        scan.close();

        BigInteger result=A.add(B);

        System.out.println(result);
    }
}
