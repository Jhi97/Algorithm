package Baekjoon.Silver;

/* Counting Sort*/
// 카운팅 정렬 참고문헌
// https://st-lab.tistory.com/104
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num10989 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] cnt = new int[10001];
        int N = Integer.parseInt(br.readLine());


        for (int i = 0; i < N; i++) {
            cnt[Integer.parseInt(br.readLine())]++;
        }

        for (int i = 1; i < 10001; i++) {
            while (cnt[i] > 0) {
                sb.append(i).append('\n');
                cnt[i]--;
            }
        }
        System.out.println(sb);
    }
}
