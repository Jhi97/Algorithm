package Baekjoon.Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num2580 {
    public static int[][] arr = new int[9][9];
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        backTracking(0, 0);
    }

    public static void backTracking(int row, int col) {

        if (col == 9) {
            backTracking(row + 1, 0);
            return;
        }
        if (row == 9) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    sb.append(arr[i][j]).append(" ");
                }
                sb.append('\n');
            }
            System.out.print(sb);
            System.exit(0);
        }

        if (arr[row][col] == 0) {
            for (int i = 1; i <= 9; i++) {
                if (check(row, col, i)) {
                    arr[row][col] = i;
                    backTracking(row, col + 1);
                }
            }
            arr[row][col] = 0;
            return;
        }
        backTracking(row, col + 1);
    }

    public static boolean check(int row, int col, int val) {
        int new_row = (row / 3) * 3;
        int new_col = (col / 3) * 3;

        for (int i = new_row; i < new_row + 3; i++) {
            for (int j = new_col; j < new_col + 3; j++) {
                if (arr[i][j] == val) {
                    return false;
                }
            }
        }

        for (int j = 0; j < 9; j++) {
            if (arr[row][j] == val) {
                return false;
            }
        }

        for (int j = 0; j < 9; j++) {
            if (arr[j][col] == val) {
                return false;
            }
        }

        return true;
    }
}
