package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num15652 {
    public static StringBuilder sb = new StringBuilder();
    public static int N, M;
    public static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        br.close();

        arr = new int[M];

        backTracking(0, 1);

        System.out.println(sb);

    }

    public static void backTracking(int cnt, int num) {

        if (cnt == M) {
            for (int i : arr) {
                sb.append(i).append(" ");
            }
            sb.append('\n');
            return;
        }

        for (int i = num; i <= N; i++) {
            arr[cnt] = i;
            backTracking(cnt+1, num);
            num++;
        }
    }
}

