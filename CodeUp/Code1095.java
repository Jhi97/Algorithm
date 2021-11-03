package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code1095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int min= Integer.MAX_VALUE;

        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            if(min>num) min = num;
        }

        System.out.println(min);
    }
}
