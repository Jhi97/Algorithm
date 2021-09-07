package Baekjoon.Silver;



/*골든바흐의 추측*/
import java.util.Scanner;
public class Num9020 {
    //false = 소수, true = 소수 아님
    public static boolean[] primeChk = new boolean[10001];
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        primeMake();
        int T = scan.nextInt();
        for (int c = 0; c < T; c++) {
            int num = scan.nextInt();
            int result1 = num / 2;
            int result2 = num / 2;
            //홀수 입력 체크
            if (num % 2 == 1) {
                System.out.println("짝수만 입력!");
                c = 0;
                continue;
            }

            while (true) {
                if (!primeChk[result1] && !primeChk[result2]) {
                    System.out.println(result1 + " " + result2);
                    break;
                }
                result1--;
                result2++;
            }

        }
    }
    public static void primeMake(){
        primeChk[0] = primeChk[1] = true;
        for (int i = 2; i <= Math.sqrt(primeChk.length); i++) {
            if (primeChk[i]) {
                continue;
            }
            for (int j = i * i; j < primeChk.length; j += i) {
                primeChk[j] = true;
            }
        }
    }
}