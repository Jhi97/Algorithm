package CodeUp;

import java.util.Scanner;

public class Code1078 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if(i%2==0)
                sum += i;

        }
        System.out.println(sum);
    }
}
