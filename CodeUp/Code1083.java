package CodeUp;

import java.util.Scanner;

public class Code1083 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();

        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0) {
                System.out.print("X ");
                continue;
            }else
                System.out.print(i+" ");

        }
    }
}
