package CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code1031 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        //10진수를 8진수로 변환 출력 //%o 8진수, %x 16진수
        System.out.printf("%o", a);
    }
}
