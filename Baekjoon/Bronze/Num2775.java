package Baekjoon.Bronze;
/*평소 반상회에 참석하는 것을 좋아하는 주희는 이번 기회에 부녀회장이 되고 싶어 각 층의 사람들을 불러 모아 반상회를 주최하려고 한다.

이 아파트에 거주를 하려면 조건이 있는데, “a층의 b호에 살려면 자신의 아래(a-1)층의 1호부터 b호까지 사람들의 수의 합만큼 사람들을 데려와 살아야 한다” 는 계약 조항을 꼭 지키고 들어와야 한다.

아파트에 비어있는 집은 없고 모든 거주민들이 이 계약 조건을 지키고 왔다고 가정했을 때, 주어지는 양의 정수 k와 n에 대해 k층에 n호에는 몇 명이 살고 있는지 출력하라.
단, 아파트에는 0층부터 있고 각층에는 1호부터 있으며, 0층의 i호에는 i명이 산다.*/


import java.util.Scanner;

public class Num2775 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] apartment;
        //Test Case
        int T = scan.nextInt();
        for (int i = 0; i < T; i++) {
            //floor
            int k = scan.nextInt();
            //Room Number
            int n = scan.nextInt();
            //아파트 생성
            apartment = new int [k+1][n];
            for (int a = 0; a < k + 1; a++) {
                int cnt = 1;
                for (int b = 0; b < n; b++) {
                    if (a == 0) {
                        apartment[0][b] = cnt;
                        cnt ++;
                    }else{
                        if (b == 0) {
                            apartment[a][0] = 1;
                        }else{
                            int first = apartment[a-1][b];
                            int second = apartment[a][b-1];
                            apartment[a][b] = first+second;
                        }
                    }
                }
            }
            System.out.println(apartment[k][n-1]);
        }
    }
}

/*
5 3

(k-1) 층
1 호 수는 무조건 1
2 호 인원수는 k+1

4층 1 6 21
3층 1 5 15 35
2층 1 4 10 20
1층 1 3 6 10
0층 1 2 3 4
 */
