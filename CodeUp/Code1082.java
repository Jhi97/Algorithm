package CodeUp;

import java.util.Scanner;

public class Code1082 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ch = scan.next();
        int i = Integer.parseInt(ch, 16);
        for (int j = 1; j <= 15; j++) {
            System.out.printf("%X"+"*"+"%X="+"%X", i, j, i*j);
            System.out.println();
        }
    }
}
