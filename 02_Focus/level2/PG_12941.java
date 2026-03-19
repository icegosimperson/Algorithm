import java.util.*;

class PG_12941 {
    public int solution(int []A, int []B){
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        int j = B.length-1;
        for(int i=0; i<A.length; i++){
            answer += (A[i] * B[j]);
            j--;
        }
        return answer; // 최종적으로 누적된 최솟값
    }
}