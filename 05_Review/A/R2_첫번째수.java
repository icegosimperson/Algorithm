import java.util.*;
class R2_첫번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int aIdx = 0; // answer 배열 인덱스
        for(int[] c : commands){
            int i = c[0];
            int j = c[1];
            int k = c[2];
            int len = j-i+1;
            int[] tArr = new int[len];
            int idx = 0;
            for(int t=i-1; t<j; t++){
                tArr[idx++] = array[t];
            }
            Arrays.sort(tArr);
            answer[aIdx++] = tArr[k-1];
        }
        return answer;
    }
}