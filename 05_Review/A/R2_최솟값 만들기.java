import java.util.*;
class R2_최솟값 만들기{
    public int solution(int []A, int []B){
        int minSum = 0;
        // 작은수*큰수 = 최소
        // A 오름차순 정렬
        // B 오름차순 정렬
        // A[0] * B[len-i]
        // A[1]
        Arrays.sort(A);
        Arrays.sort(B);
        int len = A.length-1;
        for(int i=0; i<A.length; i++){
            minSum += (A[i] * B[len-i]);
        }
        return minSum; // 최종적으로 누적된 최솟값
    }
}