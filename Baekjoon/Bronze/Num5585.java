package Baekjoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num5585 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int change = 1000 - Integer.parseInt(br.readLine());
        int[] coin = {500, 100, 50, 10, 5, 1};
        int cnt = 0;
        for (int i = 0; i < coin.length; i++) {
            if (change >= coin[i]) {
                cnt += (change/coin[i]);
                change %= coin[i];
            }
            if (change==0)
                break;
        }
        System.out.println(cnt);
    }
}
