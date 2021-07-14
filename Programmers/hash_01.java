package Programmers;

//participant = 마라톤에 참여한 선수들의 이름
//completion = 마라톤에 완주한 선수들의 이름

/* 제한사항
- 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
- completion의 길이는 participant의 길이보다 1 작습니다.
- 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
- 참가자 중에는 동명이인이 있을 수 있습니다.
* */

import java.util.HashMap;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<Integer,String> map = new HashMap<Integer,String>();

        int countPart = 0;

        for(String temp : participant) {
            map.put(countPart,temp);
            countPart++;
        }

        for(String name : completion){
            for(int i=0;i<=map.size();i++) if(name.equals(map.get(i))) map.remove(i);
        }

        for(int i : map.keySet()) {
            answer=map.get(i);
        }
        return answer;

    }
}

public class hash_01 {
    public static void main(String[] args) {
        String[] part = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] com = {"josipa", "filipa", "marina", "nikola"};

        Solution sol = new Solution();
        String name = sol.solution(part, com);
        System.out.println(name);
    }

}
