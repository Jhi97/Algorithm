package Baekjoon.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num9663 {
    public static int[] arr;
    public static int N;
    public static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        backTracking(0);
        System.out.println(count);
    }

    public static void backTracking(int cnt) {
        if (cnt == N) {
            for (int i : arr) {
                count++;
                return;
            }
        }

        for (int i = 0; i < N; i++) {
            arr[cnt] = i;
            if (check(cnt)) {
                backTracking(cnt+1);
            }
        }
    }

    public static boolean check(int cnt) {
        for (int i = 0; i < cnt; i++) {
            if (arr[i] == arr[cnt]) {
                return false;
            } else if (Math.abs(i - cnt) == Math.abs(arr[i] - arr[cnt])) {
                return false;
            }
        }
        return true;
    }
}
