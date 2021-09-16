package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num2108 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        double N = Integer.parseInt(br.readLine());
        int[] cnt = new int[8001];
        double sumAgv = 0;


        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            cnt[num+4000]++;
            sumAgv += num;
        }
        br.close();
        //산술 평균
        int avg = (int)(Math.round(sumAgv/N));

        //중앙값 체크
        int middleCount = 0;
        double middle = Math.round(N/2);
        int center = -4001;

        int maxMode = 0;
        for (int i = 0; i < 8001; i++) {
            if(cnt[i] > maxMode){
                maxMode = cnt[i];
            }
        }

        //최빈값
        int mode = 0;
        //최빈값 체크
        int modeTemp = 0;
        boolean chk = false;

        //최대 최소값
        int min = 4000;
        int max = -4000;

        for (int i = 0; i < 8001; i++) {
            int modeLocalCount = 0;
            while (cnt[i] > 0) {
                cnt[i]--;//0
                middleCount++;
                modeLocalCount++;//2
                //중앙값
                if (middleCount == middle) {
                    center = i-4000;
                }
                //최빈값
                if (modeTemp < modeLocalCount) {//1 < 2
                    modeTemp = modeLocalCount;
                    mode = i-4000;
                    chk = true;
                } else if (modeTemp == modeLocalCount && chk) {
                    mode = i-4000;
                    chk = false;
                }

                //최대 최소
                if (min > (i - 4000)) {
                    min = i-4000;
                }
                if ( max < (i - 4000)) {
                    max = i-4000;
                }
            }
        }
        sb.append(avg).append('\n');
        sb.append(center).append('\n');
        sb.append(mode).append('\n');
        sb.append(max-min).append('\n');
        System.out.print(sb);
    }
}