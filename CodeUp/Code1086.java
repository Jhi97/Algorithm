package CodeUp;

import java.util.Scanner;

public class Code1086 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble();
        double g = scan.nextDouble();
        double b = scan.nextDouble();
        scan.close();

        double imageMB = (r*g*b)/Math.pow(2, 23);
        double result = Math.round(imageMB*100)/100.0;
        System.out.printf("%.2f"+" MB", result);
    }
}
