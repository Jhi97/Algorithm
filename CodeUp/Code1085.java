package CodeUp;

import java.util.Scanner;

public class Code1085 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double h = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double s = scan.nextDouble();
        scan.close();
        double audioByte = (h*b*c*s)/8;
        double audioKb = audioByte/1024;
        double audioMb = audioKb/1024;
        System.out.println(Math.round(audioMb*10)/10.0 + " MB");
    }
}
