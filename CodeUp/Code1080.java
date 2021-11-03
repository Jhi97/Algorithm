package CodeUp;

import java.util.Scanner;

public class Code1080 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;
        int cnt = 0;
        while (true) {
            cnt += 1;
            sum += cnt;
            if(sum >= num)
                break;
        }
        System.out.println(cnt);
    }
}
