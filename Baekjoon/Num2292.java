package Baekjoon;
/* 그림참조
* 그림에서 보는 바와 같이 중앙의 방 1부터 시작해서 이웃하는 방에 돌아가면서 1씩 증가하는 번호를 주소로 매길 수 있다.
* 숫자 N이 주어졌을 때, 벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나가는지(시작과 끝을 포함하여)를 계산하는 프로그램을 작성하시오.
* 예를 들면, 13까지는 3개, 58까지는 5개를 지난다.*/


import java.util.Scanner;

public class Num2292 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        int cnt = 1;
        int num = 2;

        if(n==1)
            System.out.println(1);
        else{
            while(num<=n){
                num += (6*cnt);
                cnt++;
            }
            System.out.println(cnt);
        }
    }
}
/*
*  1 (1)
*  7 (6)
*  19 (12)
*  37 (18)
*  61 (24)
* */