package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num15650 {
    public static StringBuilder sb = new StringBuilder();
    public static int N, M;
    public static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M];

        backTracking(1, 0);

        System.out.print(sb);
    }

    public static void backTracking(int temp, int cnt) {

        if (cnt == M) {
            for (int i : arr) {
                sb.append(i).append(" ");
            }
            sb.append('\n');
            return;
        }

        for (int i = temp; i <= N; i++) {
                arr[cnt] = i;
                backTracking(i+1, cnt+1);
        }
    }
}
