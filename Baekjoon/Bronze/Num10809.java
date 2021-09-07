package Baekjoon.Bronze;
/*알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서,
단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.*/

import java.util.Scanner;

public class Num10809 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int[] alphabet = new int[26];
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = -1;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(alphabet[ch-'a'] != -1)
                continue;
            alphabet[ch - 'a'] = i;
        }

        for (int i : alphabet) {
            System.out.print(i+" ");
        }

    }
}
