package Baekjoon;
/*땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.

달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 또, 정상에 올라간 후에는 미끄러지지 않는다.

달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num2869 {
    public static void main(String[] args) throws IOException {
        // 시간 초과 150ms
        /*Scanner scan = new Scanner(System.in);
        //낮에 올라가는 미터
        int A = scan.nextInt();
        //밤에 미끄러지는 미터
        int B = scan.nextInt();
        //총 높이가 V인 막대기
        int V = scan.nextInt();
        scan.close();

        int day = (V-B)/(A-B);

        if((V-B)%(A-B) != 0){
            day++;
        }

        System.out.println(day);*/
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");

        //낮에 올라가는 미터
        int A = Integer.parseInt(stringTokenizer.nextToken());
        //밤에 미끄러지는 미터
        int B = Integer.parseInt(stringTokenizer.nextToken());
        //총 높이가 V인 막대기
        int V = Integer.parseInt(stringTokenizer.nextToken());

        int day = (V - B) / (A - B);

        if ((V - B) % (A - B) != 0){
            day++;
        }

        System.out.println(day);

    }
}
