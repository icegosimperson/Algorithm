import java.util.*;
class PG_42884 {
    public int solution(int[][] routes) {
        int answer = 0;
        Arrays.sort(routes, (a, b)->Integer.compare(a[1], b[1]));
        int prev = Integer.MIN_VALUE;
        for(int[] route : routes){
            if(prev < route[0]){
                answer++;
                prev = route[1];
            }
        }
        return answer;
    }
}