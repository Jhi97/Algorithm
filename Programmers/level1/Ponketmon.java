package Programmers.level1;
/*연구실에 있는 N마리의 폰켓몬 중 N/2마리를 가져가도 좋다고 한다.
당신은 최대한 다양한 종류의 폰켓몬을 가지길 원하기 때문에, 최대한 많은 종류의 폰켓몬을 포함해서 N/2마리를 선택하려 합니다.
N마리 폰켓몬의 종류 번호가 담긴 배열 nums가 매개변수로 주어질 때, N/2마리의 폰켓몬을 선택하는 방법 중, 가장 많은 종류의 폰켓몬을 선택하는 방법을 찾아,
그때의 폰켓몬 종류 번호의 개수를 return 하도록 solution 함수를 완성해주세요.*/


import java.util.HashMap;
import java.util.Map;

class Solution_Ponketmon {
    public int solution(int[] nums) {
        int answer = 0;
        if(nums.length<=1) return 0;
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numsMap.put(nums[i], i);
        }
        int pick = (nums.length/2);
        if(numsMap.size()<=pick){
            answer = numsMap.size();
        }else{
            answer = pick;
        }
        return answer;
    }
}


class Ponketmon {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,1,2};
        Solution_Ponketmon sol = new Solution_Ponketmon();
        System.out.println(sol.solution(nums));
    }
}
