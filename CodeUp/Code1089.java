package CodeUp;

import java.util.Scanner;

public class Code1089 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int d = scan.nextInt();
        int n = scan.nextInt();
        scan.close();

        int result = a + (d*(n-1));
        System.out.println(result);
    }
}
