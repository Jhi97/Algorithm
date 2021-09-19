package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Num1181 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }
        Arrays.sort(arr, (e1, e2)->{
            if (e1.length() != e2.length()) {
                return e1.length() - e2.length();
            }
            for (int i = 0; i < e1.length(); i++) {
                int temp1 = e1.charAt(i);
                int temp2 = e2.charAt(i);

                if(temp1 > temp2 || temp1 < temp2){
                    return temp1 - temp2;
                }
            }
            return 0;
        });


        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]).append('\n');
        for (int i = 1; i < N; i++) {
            if (arr[i - 1].equals(arr[i])) {
                continue;
            }
            sb.append(arr[i]).append('\n');
        }
        System.out.println(sb);

    }
}
