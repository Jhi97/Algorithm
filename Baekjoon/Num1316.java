package Baekjoon;
/*그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.
예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고,
kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만,
aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.

단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.*/


import java.util.Scanner;

public class Num1316 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int cnt = 0;
        String[] input = new String[num];
        for (int i = 0; i < num; i++) {
            input[i] = scan.next();
        }
        scan.close();

        for (int i = 0; i < num; i++) {
            boolean[] alphabet = new boolean[26];
            boolean chk = true;
            char ch = input[i].charAt(0);
            alphabet[ch-'a'] = true;

            for (int j = 1; j < input[i].length(); j++) {
                ch = input[i].charAt(j);
                if (ch == input[i].charAt(j - 1)) {
                    continue;
                }else{
                    int index = ch-'a';
                    //이전에 나온 알파벳이면
                    if(alphabet[index]){
                        chk = false;
                        break;
                    }else{
                        alphabet[index] = true;
                        continue;
                    }
                }

            }
            if(chk)
                cnt ++;
        }
        System.out.println(cnt);
    }
}
