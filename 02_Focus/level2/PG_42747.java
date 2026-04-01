import java.util.*;
class PG_42747 {
    public int solution(int[] citations) {
        int n = citations.length;
        Arrays.sort(citations);
        for(int i=0; i<n; i++){
            int h = n - i;
            if(citations[i]>=h){
                return h;
            }
        }
        return 0;
    }
}