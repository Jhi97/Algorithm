package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num14888 {
    public static int[] arr;
    public static int[] operator = new int[4];
    public static int N;
    public static int MIN = 1000000000;
    public static int MAX = -1000000000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine(), " ");
        br.close();
        for (int i = 0; i < 4; i++) {
                operator[i] = Integer.parseInt(st.nextToken());
        }

        backTracking(1, arr[0]);

        System.out.println(MAX);
        System.out.println(MIN);
    }

    public static void backTracking(int cnt, int num){
        if (cnt == N) {
            MAX = Math.max(MAX, num);
            MIN = Math.min(MIN, num);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operator[i] > 0) {
                operator[i]--;

                switch (i) {
                    case 0: backTracking(cnt+1, num + arr[cnt]); break;
                    case 1: backTracking(cnt+1, num - arr[cnt]); break;
                    case 2: backTracking(cnt+1, num * arr[cnt]); break;
                    case 3: backTracking(cnt+1, num / arr[cnt]); break;
                }
                operator[i]++;
            }
        }
    }
}
