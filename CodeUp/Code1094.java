package CodeUp;

import java.util.Scanner;

public class Code1094 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            arr[i] = scan.nextInt();
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
