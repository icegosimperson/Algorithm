import java.util.*;
class PG_43236_R2 {
    public int solution(int distance, int[] rocks, int n) {
        int answer = 0;
        int start = 1;
        int end = distance;
        Arrays.sort(rocks);
        while(start<=end){
            int mid = (start+end)/2;
            int removeRocks = 0;
            int prevPos = 0;
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