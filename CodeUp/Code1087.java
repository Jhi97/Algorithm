package CodeUp;

import java.util.Scanner;

public class Code1087 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();
        int sum = 0;
        int cnt = 0;
        while (sum < num) {
            cnt++;
            sum+=cnt;
        }
        System.out.println(sum);
    }
}
