package Baekjoon;

import java.util.Scanner;

/*1/1 -> 1/2 -> 2/1 -> 3/1 -> 2/2 -> … 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.

X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.*/
public class Num1193 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        int cnt = 1;
        int pre_cnt = 0;

        while (true) {
            if(n<=pre_cnt+cnt){
                if(cnt%2==0){
                    System.out.println((n-pre_cnt)+"/"+(cnt-(n-pre_cnt-1)));
                    break;
                }else{
                    System.out.println((cnt-(n-pre_cnt-1))+"/"+(n-pre_cnt));
                    break;
                }
            }else{
                pre_cnt += cnt;
                cnt++;
            }
        }
    }
}


