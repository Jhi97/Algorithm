package Programmers.level1;

//participant = 마라톤에 참여한 선수들의 이름
//completion = 마라톤에 완주한 선수들의 이름

/* 제한사항
- 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
- completion의 길이는 participant의 길이보다 1 작습니다.
- 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
- 참가자 중에는 동명이인이 있을 수 있습니다.
* */

import java.util.*;

class Solution_hash_01 {
    public String arraySort(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        int l = completion.length;
        for (int i = 0; i < l; i++) {
            if (!participant[i].equalsIgnoreCase(completion[i]))
                return participant[i];
        }

        return participant[l];
    }

    public String solution(String[] participant, String[] completion) {
        return arraySort(participant, completion);
    }
}

class hash_01 {
    public static void main(String[] args) {

    }

}
