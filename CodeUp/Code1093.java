package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code1093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[23];

        while (st.hasMoreTokens()) {
            int i = Integer.parseInt(st.nextToken()) -1;
            arr[i]++;
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
