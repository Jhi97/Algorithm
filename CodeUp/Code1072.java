package CodeUp;

import java.util.Scanner;

public class Code1072 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt = scan.nextInt();
        recursive(cnt, scan);
    }
    static void recursive(int cnt, Scanner scan) {
        if (cnt == 0)
            return;
        int num = scan.nextInt();
        System.out.println(num);

        recursive(--cnt, scan);
    }
}
