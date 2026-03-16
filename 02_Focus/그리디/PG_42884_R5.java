import java.util.*;
class PG_42884_R5 {
    public int solution(int[][] routes) {
        int answer = 0;
        int camera = Integer.MIN_VALUE;
        Arrays.sort(routes, (a, b)->a[1]-b[1]);
        for(int[] route : routes){
            int s = route[0];
            int e = route[1];
            if(s > camera){
                answer++;
                camera = e;
            }
        }
        return answer;
    }
}