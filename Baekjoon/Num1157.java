package Baekjoon;
/*알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
 단, 대문자와 소문자를 구분하지 않는다.*/


import java.util.Arrays;
import java.util.Scanner;

public class Num1157 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int[] alphabet = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (65 <= ch && ch <= 90) {
                alphabet[ch-'A']++;
            }else{
                alphabet[ch-'a']++;
            }
        }

        int index = 0;
        int temp = alphabet[0];
        for (int i = 0; i < alphabet.length; i++) {
            if(temp<alphabet[i]){
                temp = alphabet[i];
                index = i;
            }
        }

        Arrays.sort(alphabet);
        if (alphabet[25] == alphabet[24]) {
            System.out.println("?");
        }else{
            System.out.println((char) (65+index));
        }

    }
}
