package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code1097 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        //배열 설정
        int[][] checkerBoard = new int[19][19];
        for (int i = 0; i < 19; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 19; j++) {
                checkerBoard[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int n = Integer.parseInt(br.readLine());
        // 십자 뒤집기
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken()) -1;
            int y = Integer.parseInt(st.nextToken()) -1;
            //x, y열 뒤집기
            for (int j = 0; j < 19; j++) {
                checkerBoard[x][j] = changer(checkerBoard[x][j]);
                checkerBoard[j][y] = changer(checkerBoard[j][y]);
            }
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
    static int changer(int num) {
        if (num == 1)
            num = 0;
        else
            num = 1;

        return num;
    }
}
