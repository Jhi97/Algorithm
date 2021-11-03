package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code1099 {
    public static void main(String[] args) throws IOException {
        int[][] arr = new int[10][10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        //배열 초기화
        for (int i = 0; i < 10; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 10; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //개미 초기 위치
        int x = 1; int y = 1;

        while (true) {
            if (arr[x][y] == 2) {
                arr[x][y] = 9;
                break;
            }
            arr[x][y] = 9;
            if (arr[x][y + 1] != 1) {
                y++;
                if(arr[x][y] == 0) {
                    arr[x][y] = 9;
                    continue;
                } else if (arr[x][y] == 2) {
                    arr[x][y] = 9;
                    break;
                }
            } else if (arr[x + 1][y] != 1) {
                x++;
                if(arr[x][y] == 0) {
                    arr[x][y] = 9;
                    continue;
                } else if (arr[x][y] == 2) {
                    arr[x][y] = 9;
                    break;
                }
            } else{
                //오른쪽 아래쪽 막혀있을 시
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                sb.append(arr[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
