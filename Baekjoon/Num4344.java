package Baekjoon;
/*첫째 줄에는 테스트 케이스의 개수 C가 주어진다.

둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고,
이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Num4344 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();scan.nextLine();
        double[] result = new double[num];
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            int sum = 0;
            String str = scan.nextLine();
            int[] strSplit = Stream.of(str.split(" "))
                    .mapToInt(Integer::parseInt).toArray();
            // 모든 점수 더하기
            for (int j = 1; j <= strSplit[0]; j++) {
                sum += strSplit[j];
            }
            // 점수 평균
            int avg = sum/strSplit[0];
            // 평균을 넘은 학생 수
            int count = 0;
            // 평균을 넘은 학생 카운트
            for (int j = 1; j <= strSplit[0]; j++) {
                if(strSplit[j]>avg){
                    count++;
                }
            }
            // 평균을 넘은 학생의 비율
            result[i] = (double)count/strSplit[0]*100;
        }

        for(double i : result)
            System.out.println(String.format("%.3f",i)+"%");


    }
}
