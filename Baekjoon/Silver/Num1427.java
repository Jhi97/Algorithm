package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num1427 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] counting = new int[10];
        int cnt = 0;

        while (N != 0) {
            counting[N % 10]++;
            N = N/10;
        }

        for (int i = 9; i >= 0; i--) {
            while (counting[i] > 0) {
                counting[i]--;
                sb.append(i);
            }
        }

        System.out.println(sb);
    }
}
