package Programmers.level1;
/*배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
2에서 나온 배열의 3번째 숫자는 5입니다.
배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution_K_number {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0; i<commands.length; i++){

            int start = commands[i][0]-1;
            int end = commands[i][1]-1;
            int select = commands[i][2]-1;

            answer[i] = setList(array,start, end, select);
        }


        return answer;
    }

    public int setList(int[] array, int start, int end, int select) {
        List<Integer> temp = new ArrayList<>();
        if(start == end){
            return array[start];
        }else{
            for(int i = start; i<=end; i++){
                temp.add(array[i]);
            }
        }
        // 리스트 정렬
        Collections.sort(temp);
        return temp.get(select);
    }

}


class K_number {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2,5,3}, {4,4,1}, {1,7,3}};

        Solution_K_number sol = new Solution_K_number();
        int[] result = sol.solution(array, commands);
        for(int i : result)
            System.out.println(i);

    }
}
