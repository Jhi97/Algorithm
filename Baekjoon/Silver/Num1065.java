package Baekjoon.Silver;
/*어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다.
등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. */

import java.util.Scanner;

public class Num1065 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int result = hansu(input);
        System.out.println(result);
    }

    public static int hansu(int n){
        int count = 0;

        for (int i = 1; i <= n; i++) {
            int num = i;
            //1~99는 모두 등차수열이다.
            if (num < 100) {
                count++;
                continue;
            }
            int a = num%10;
            int b = (num/10)%10;
            int gongcha = a-b;
            num = num/10;

            while (num != 0) {
                a = num%10;
                b = (num/10)%10;
                num = num/10;
                int temp = a-b;
                if(gongcha!=temp)
                    break;
            }
            if (num != 0) {
                continue;
            }else{
                count++;
            }


        }

        return count;
    }
}
