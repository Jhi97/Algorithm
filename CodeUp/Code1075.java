package CodeUp;

import java.util.Scanner;

public class Code1075 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt = scan.nextInt();
        scan.close();

        while (cnt!=0) {
            System.out.println(cnt-1);
            cnt--;
        }
    }
}
