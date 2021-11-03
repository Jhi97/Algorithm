package CodeUp;

import java.util.Scanner;

public class Code1079 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        while (num != 'q') {
            num = scan.next().charAt(0);
            System.out.println((char) num);
        }
    }
}
