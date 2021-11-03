package CodeUp;

import java.util.Scanner;

public class Code1088 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();
        for (int i = 1; i <= num; i++) {
            if(i % 3 == 0)
                continue;
            System.out.print(i+" ");
        }
    }
}
