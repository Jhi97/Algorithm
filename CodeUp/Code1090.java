package CodeUp;

import java.util.Scanner;

public class Code1090 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int r = scan.nextInt();
        int n = scan.nextInt();
        scan.close();

        if (n == 1) {
            System.out.println(a);
        }else{
            long result = (long) (a*Math.pow(r, n-1));
            System.out.println(result);
        }

    }
}
