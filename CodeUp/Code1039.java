package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Code1039 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        // int 형을 넘어가는 테스트 케이스에 대해 long 형 선언
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        System.out.println(a + b);
    }
}