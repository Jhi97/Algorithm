package CodeUp;

import java.util.Scanner;

public class Code1066 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = scan.nextInt();
        }
        scan.close();

        for (int i : arr) {
            if (i % 2 == 0) {
                System.out.println("even");
            }else
                System.out.println("odd");
        }
    }
}
