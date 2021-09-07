package Baekjoon.Silver;
/* 문제 표 참고.
* 예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다.
* 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
* dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다.
* 위 목록에 없는 알파벳은 한 글자씩 센다.
* */


import java.util.Scanner;

public class Num2941 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        scan.close();
        String[] alphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        int cnt = 0;
        String temp = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            temp += ch;
            if (temp.length() >= 2) {
                if (temp.equals("dz")) {
                    if (input.charAt(i + 1) == '=') {
                        continue;
                    } else {
                        temp = String.valueOf(temp.charAt(1));
                        cnt += 1;
                    }
                } else {
                    for (int c = 0; c < alphabet.length; c++) {
                        if (alphabet[c].equals(temp)) {
                            temp = "";
                            cnt += 1;
                            break;
                        }
                    }
                    if(i==input.length()-1 && temp.length()!=0) {
                        cnt += 2;
                    }else if(temp.length()!=0){
                        temp = String.valueOf(temp.charAt(1));
                        cnt += 1;
                    }
                }
            }else if(i==input.length()-1){
                cnt += 1;
            }
        }
        System.out.println(cnt);
    }
}
