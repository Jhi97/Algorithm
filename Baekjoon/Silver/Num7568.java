package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num7568 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] spec = new int[N][3];

        // 배열에 몸무게, 키 저장
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            //등수 모두 1로 초기화
            spec[i][2] = 1;
            for (int j = 0; j < 2; j++) {
                spec[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        rank(spec);

        for (int i = 0; i < N; i++) {
            if(i==N-1) {
                System.out.print(spec[N-1][2]);
                return;
            }
            System.out.print(spec[i][2] + " ");
        }
    }

    public static void rank(int[][] spec){
        // 비교군 설정
        int tempX, tempY;

        for (int i = 0; i < spec.length; i++) {
            tempX = spec[i][0];
            tempY = spec[i][1];
            for (int j = 0; j < spec.length; j++) {
                if(tempX < spec[j][0] && tempY < spec[j][1]){
                    spec[i][2]++;
                }
            }
        }
    }
}
