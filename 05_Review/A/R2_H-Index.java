import java.util.*;
class H-Index {
    public int solution(int[] citations) {
        int n = citations.length;
        Arrays.sort(citations);
        for(int i=0; i<n; i++){
            int h = citations[i];
            int cnt= n-i;
            if(h>=cnt){
                return cnt;
            }
        }
        return 0; //과학자가 발표한 논문의 인용 횟수
    }
}