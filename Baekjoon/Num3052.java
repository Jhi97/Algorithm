package Baekjoon;
/*두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다.
예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다.

수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다.
그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.*/

import java.util.Arrays;
import java.util.Scanner;

public class Num3052 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[10];
        int count = 1;

        for (int i = 0; i < array.length; i++) {
            int num = scan.nextInt();
            array[i] = num%42;
        }
        // 배열 정렬
        Arrays.sort(array);

        for (int i = 0; i < array.length-1; i++) {
            if (array[i] != array[i + 1]) {
                count++;
                continue;
            }
        }
        System.out.println(count);
    }
}
