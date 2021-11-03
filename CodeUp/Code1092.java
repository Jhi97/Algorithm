package CodeUp;

import java.util.Scanner;

public class Code1092 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int day = 1;
        while (true) {
            if(day%a==0&&day%b==0&&day%c==0){
                break;
            }
            day++;
        }
        System.out.println(day);
    }
}
