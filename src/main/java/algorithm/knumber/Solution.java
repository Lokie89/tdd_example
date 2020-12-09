package algorithm.knumber;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        Array cutSortGetArray = Array.of(array);
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            answer[i] = cutSortGetArray.cut(commands[i][0],commands[i][1]).sort().get(commands[i][2]);
        }
        return answer;
    }
}
