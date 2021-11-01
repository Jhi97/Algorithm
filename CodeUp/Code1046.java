package CodeUp;

import java.util.Arrays;
import java.util.Scanner;

public class Code1046 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = scan.nextInt();
        }
        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);
        double avg = Arrays.stream(arr).average().getAsDouble();
        System.out.printf("%.1f", avg);
    }
}
