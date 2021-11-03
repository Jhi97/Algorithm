package CodeUp;

import java.util.Scanner;

public class Code1076 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.next().charAt(0);
        char ch = 'a';
        while (num >= ch) {
            System.out.println(ch);
            ch++;
        }
    }
}
