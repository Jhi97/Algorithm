package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num1018{
    public static int min = 64;
    public static boolean[][] WB;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int N = Integer.parseInt(split[0]);
        int M = Integer.parseInt(split[1]);

        WB = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                if (line.charAt(j) == 'W') {
                    WB[i][j] = true;
                } else {
                    WB[i][j] = false;
                }
            }
        }

        int row = N-7;
        int col = M-7;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                cnt(i,j);
            }
        }
        System.out.println(min);
    }

    public static void cnt(int row, int col) {
        int x = row + 8;
        int y = col + 8;
        int count = 0;

        boolean temp = WB[row][col];

        for (int i = row; i < x; i++) {
            for (int j = col; j < y; j++) {

                if (temp != WB[i][j]) {
                    count++;
                }

                temp = !temp;
            }
            temp = !temp;
        }
        count = Math.min(count, 64-count);
        min = Math.min(min, count);
    }
}