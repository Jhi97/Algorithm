package Baekjoon;
/*전화를 걸고 싶은 번호가 있다면, 숫자를 하나를 누른 다음에 금속 핀이 있는 곳 까지 시계방향으로 돌려야 한다.
숫자를 하나 누르면 다이얼이 처음 위치로 돌아가고, 다음 숫자를 누르려면 다이얼을 처음 위치에서 다시 돌려야 한다.

숫자 1을 걸려면 총 2초가 필요하다. 1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며,
한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.

상근이의 할머니는 전화 번호를 각 숫자에 해당하는 문자로 외운다.
즉, 어떤 단어를 걸 때, 각 알파벳에 해당하는 숫자를 걸면 된다. 예를 들어, UNUCIC는 868242와 같다.

할머니가 외운 단어가 주어졌을 때, 이 전화를 걸기 위해서 필요한 최소 시간을 구하는 프로그램을 작성하시오.*/


import java.util.Scanner;

public class Num5622 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt = 0;
        String input = scan.next();
        scan.close();

        //각 자리에 걸리는 시간
        int[] numTime = {3, 4, 5, 6, 7, 8, 9, 10};


        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int ascii = ch - 'A';
            if (ascii < 15) {
                int mok = ascii/3;
                cnt += numTime[mok];
            }else{
                if(15<=ascii && ascii<19){
                    cnt += numTime[5];
                } else if (19 <= ascii && ascii < 22) {
                    cnt += numTime[6];
                } else{
                    cnt += numTime[7];
                }
            }

        }
        System.out.println(cnt);
    }
}