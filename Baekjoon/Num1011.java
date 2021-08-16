package Baekjoon;
/*이전 작동시기에 k광년을 이동하였을 때는 k-1 , k 혹은 k+1 광년만을 다시 이동할 수 있다.
* 김우현은 공간이동 장치 작동시의 에너지 소모가 크다는 점을 잘 알고 있기 때문에 x지점에서 y지점을 향해 최소한의 작동 횟수로 이동하려 한다.
* 하지만 y지점에 도착해서도 공간 이동장치의 안전성을 위하여 y지점에 도착하기 바로 직전의 이동거리는 반드시 1광년으로 하려 한다.
* */


import java.util.Scanner;

public class Num1011 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int i = 0; i < T; i++) {
            int X = scan.nextInt();
            int Y = scan.nextInt();

            int distance = Y-X;
            int max_speed = (int) Math.sqrt(distance);

            if (max_speed == Math.sqrt(distance)) {
                System.out.println(max_speed * 2 - 1);
            } else if (distance <= max_speed * max_speed + max_speed) {
                System.out.println(max_speed * 2);
            } else {
                System.out.println(max_speed * 2 + 1);
            }
        }
    }
}
