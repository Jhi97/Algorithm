package CodeUp;

import java.util.Scanner;

public class Code1067 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a < 0) {
            System.out.println("minus");
        } else
            System.out.println("plus");

        if (a % 2 == 0) {
            System.out.println("even");
        } else
            System.out.println("odd");
    }
}
