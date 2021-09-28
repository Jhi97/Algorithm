package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num14889 {
    static int N;
    static boolean[] visit;
    static int[][] ability;
    static int MIN = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        visit = new boolean[N];
        ability = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < N; j++) {
                ability[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        teamMaker(0, 0);
        System.out.println(MIN);
    }

    static void teamMaker (int cnt, int chk) {
        if (cnt == N / 2) {
            backTracking();
            return;
        }

        for (int i = chk; i < N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                teamMaker(cnt+1, chk+1);
                visit[i] = false;
            }
        }
    }

    static void backTracking() {
        int firstTeam = 0;
        int secondTeam = 0;

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (visit[i] == true && visit[j] == true) {
                    firstTeam += ability[i][j];
                    firstTeam += ability[j][i];
                } else if (visit[i] == false && visit[j] == false) {
                    secondTeam += ability[i][j];
                    secondTeam += ability[j][i];
                }
            }
        }
        int result = Math.abs(firstTeam - secondTeam);

        if (result == 0) {
            System.out.println(result);
            System.exit(0);
        }

        MIN = Math.min(result, MIN);
    }
}
