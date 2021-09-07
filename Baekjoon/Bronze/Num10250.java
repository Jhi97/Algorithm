package Baekjoon.Bronze;
/* 지우의 호텔 정문부터의 최단거리 객실 배정 프로그램 */


import java.util.Scanner;

public class Num10250 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //예제 갯수
        int T = scan.nextInt();

        //H : 호텔의 층, W : 호텔의 한층 당 방 갯수, N : 방을 필요로 하는 손님들
        for (int i = 0; i < T; i++) {
            int H = scan.nextInt();
            int W = scan.nextInt();
            int N = scan.nextInt();

            int floor;
            int roomNum;

            if(N%H==0){
                floor = H;
                roomNum = N / H;

            }else{
                floor = N % H;
                roomNum = (N / H) + 1;

            }
            System.out.println((floor*100)+roomNum);
        }
    }
}
