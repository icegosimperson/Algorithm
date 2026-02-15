import java.util.*;
class PG_43238 {
    public long solution(int n, int[] times) {
        long answer = 0;
        long start = 1;
        long end = (long) times[times.length-1]*n;
        while(start<=end){
            long mid = (start+end)/2;
            long totalPerson = 0;
            for(int i=0; i<times.length; i++){
                totalPerson += mid/times[i];
                if(totalPerson>=n) break;
            }
            if(totalPerson<n){
                start = mid+1;
            } else{
                end = mid-1;
                answer = mid;
            }
        }
        return answer;
    }
}