package Baekjoon.Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num1003 {
    static Integer[][] arr = new Integer[41][2];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        arr[0][0] = 1;
        arr[0][1] = 0;
        arr[1][0] = 0;
        arr[1][1] = 1;

        for (int i = 0; i < T; i++) {
            int num = Integer.parseInt(br.readLine());
            fibonacci(num);
            sb.append(arr[num][0] + " " + arr[num][1]).append('\n');
        }

        System.out.println(sb);

    }

    public static Integer[] fibonacci(int num) {

        if (arr[num][0] == null || arr[num][1] == null) {
            arr[num][0] = fibonacci(num - 1)[0] + fibonacci(num - 2)[0];
            arr[num][1] = fibonacci(num - 1)[1] + fibonacci(num - 2)[1];
        }

        return arr[num];
    }
}
