package Baekjoon.Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int[] card = new int[N];
        for (int i = 0; i < N; i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }
        int result = cardSum(card, N, M);

        System.out.println(result);
    }


    public static int cardSum(int[] card, int N, int M) {
        int result = 0;

        for (int fir = 0; fir < N - 2; fir++) {
            if (card[fir] > M) continue;

            for (int sec = fir + 1; sec < N - 1; sec++) {
                if (card[fir] + card[sec] > M) continue;

                for (int thr = sec + 1; thr < N; thr++) {
                    int temp = card[fir] + card[sec] + card[thr];

                    if (temp == M) {
                        return temp;
                    } else if (result < temp && temp < M) {
                        result = temp;
                    }
                }
            }
        }
        return result;
    }
}
