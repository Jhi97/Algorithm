package CodeUp;

import java.util.Scanner;

public class Code1064 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println((a>b?b:a)>c?c:(a>b?b:a));
    }
}
