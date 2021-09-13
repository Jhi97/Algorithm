package Baekjoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strN = br.readLine();
        br.close();
        int N_len = strN.length();
        int N = Integer.parseInt(strN);
        int result = 0;

        for (int i = N - (9 * N_len); i < N; i++) {
            int num = i;
            int sum = i;

            while (num != 0) {
                sum +=  num % 10;
                num /= 10;
            }

            if (sum == N) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
