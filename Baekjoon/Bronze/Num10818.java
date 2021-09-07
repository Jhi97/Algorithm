package Baekjoon.Bronze;

/*N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Num10818 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        List<String> list = new ArrayList<>();
        num=scan.nextInt();
        // 개행 문자 삭제
        scan.nextLine();
        String str = scan.nextLine();
        String[] splitString = str.split(" ");
        int[] splitInt = new int[num];
        for (int i = 0; i < num; i++) {
            splitInt[i] = Integer.parseInt(splitString[i]);
        }
        Arrays.sort(splitInt);
        System.out.println(splitInt[0]+" "+splitInt[num-1]);
    }
}
