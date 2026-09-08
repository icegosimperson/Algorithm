import java.util.*;
class R2_k번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int aIdx = 0;
        for(int[] c : commands){
            int i = c[0];
            int j = c[1];
            int k = c[2];
            int len = j-i+1;
            int[] temp = new int[len];
            int idx=0;
            for(int t=i-1; t<j; t++){
                temp[idx++] = array[t];
            }
            Arrays.sort(temp);
            answer[aIdx++] = temp[k-1];
        }
        return answer;
    }
}