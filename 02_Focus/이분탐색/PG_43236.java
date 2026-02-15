import java.util.*;
class PG_43236 {
    public int solution(int distance, int[] rocks, int n) {
        Arrays.sort(rocks);
        int answer = 0;
        int start = 1;
        int end = distance;
        while(start<=end){
            int mid = (start+end)/2;
            int prevPos = 0;
            int removeRocks = 0;
            for(int i=0; i<rocks.length; i++){
                if(rocks[i]-prevPos<mid){
                    removeRocks++;
                } else{
                    prevPos = rocks[i];
                }
            }
            if(distance-prevPos < mid){
                removeRocks++;
            }
            if(removeRocks<=n){
                answer = mid;
                start = mid+1;
            } else{
                end = mid-1;
            }
        }
        return answer;
    }
}