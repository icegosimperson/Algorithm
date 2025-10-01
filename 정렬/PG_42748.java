/*
i번부터 j번까지 자르고, 정렬 후 k번째인 수 return
[i, j, k]
*/
import java.util.*;

class PG_42748 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0; i<commands.length; i++){
            int start = commands[i][0]-1;
            int end = commands[i][1];
            int slice = commands[i][2]-1;

            int[] temp = Arrays.copyOfRange(array, start, end);

            Arrays.sort(temp);

            answer[i] = temp[slice];
        }
        return answer;
    }
}