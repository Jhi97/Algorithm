package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num15649 {
    public static int[] arr;
    public static boolean[] boolArr;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        br.close();

        arr = new int[M];
        boolArr = new boolean[N];

        backTracking(N, M, 0);
        System.out.print(sb);
    }

    public static void backTracking(int N, int M, int cnt) {

        if (cnt == M) {
            for (int i : arr) {
                sb.append(i).append(" ");
            }
            sb.append('\n');
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!boolArr[i]) {
                boolArr[i] = true;
                arr[cnt] = i+1;
                backTracking(N, M, cnt+1);
                boolArr[i] = false;
            }
        }
    }
}
