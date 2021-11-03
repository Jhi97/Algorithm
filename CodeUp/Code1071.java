package CodeUp;

import java.util.Scanner;

public class Code1071 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        recursive(scan);

    }
    static void recursive (Scanner scan){
        int a = scan.nextInt();
        if (a == 0)
            return;
        else
            System.out.println(a);
        recursive(scan);
    }
}
