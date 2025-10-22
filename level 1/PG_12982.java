import java.util.*;
class PG_12982 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        for(int i=0; i<d.length; i++){
            // if(d[i] - budget<0이면 지원할 수 없음)
            if(budget - d[i] >=0){
                budget -= d[i];
                answer++;
            } else break;
        }
        return answer;
    }
}