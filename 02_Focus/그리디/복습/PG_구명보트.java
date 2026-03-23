import java.util.*;
class PG_구명보트 {
    public int solution(int[] people, int limit) {
        Arrays.sort(people); // 50, 50, 70, 80
        int answer = 0;
        int idx = 0;
        for(int i=people.length-1; i>=idx; i--){
            if(people[i] + people[idx] <= limit){
                idx++;
            }
            answer++;
        }
        return answer;
    }
}