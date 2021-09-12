package Baekjoon.Silver;
/*세 개의 장대가 있고 첫 번째 장대에는 반경이 서로 다른 n개의 원판이 쌓여 있다. 각 원판은 반경이 큰 순서대로 쌓여있다.
이제 수도승들이 다음 규칙에 따라 첫 번째 장대에서 세 번째 장대로 옮기려 한다.

한 번에 한 개의 원판만을 다른 탑으로 옮길 수 있다.
쌓아 놓은 원판은 항상 위의 것이 아래의 것보다 작아야 한다.
이 작업을 수행하는데 필요한 이동 순서를 출력하는 프로그램을 작성하라. 단, 이동 횟수는 최소가 되어야 한다.*/


import java.io.*;

public class Num11729 {
    static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());

        int count = (int) Math.pow(2, N) - 1;
        bufferedWriter.write(count + "\n");

        Hanoi(N, 1,2,3);

        bufferedWriter.flush();
        bufferedWriter.close();
    }

    public static void Hanoi(int N, int first, int second, int third) throws IOException {
        //옮길 원판이 한개일 경우
        if (N == 1) {
            bufferedWriter.write(first + " " + third + "\n");
            return;
        }

        // 1 -> 2 이동 (N-1 개)
        Hanoi(N-1, first, third, second);

        // 1 -> 3 (1 개)
        bufferedWriter.write(first + " " + third + "\n");

        // 2 -> 3 (N-1 개)
        Hanoi(N-1, second, first, third);

    }
}
