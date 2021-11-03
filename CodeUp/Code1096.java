package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code1096 {
    public static void main(String[] args) throws IOException {
        int[][] checkerBoard = new int[19][19];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken()) -1;
            int y = Integer.parseInt(st.nextToken()) -1;

            checkerBoard[x][y] = 1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                sb.append(checkerBoard[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
