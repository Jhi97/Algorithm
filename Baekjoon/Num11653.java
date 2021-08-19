package Baekjoon;
//정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Num11653 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int N = scan.nextInt();
        scan.close();
        if (N == 1)
            return;

        for (int i = 2; i <= N; i++) {
            while (N % i == 0) {
                N = N/i;
                list.add(i);
            }
        }

        Collections.sort(list);
        for (Integer num : list) {
            System.out.println(num);
        }
    }
}
