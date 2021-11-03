package CodeUp;

import java.util.Scanner;

public class Code1073 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        recursive();
    }

    static void recursive(){
        int num = scan.nextInt();
        if(num == 0)
            return;
        else
            System.out.println(num);
        recursive();
    }
}
