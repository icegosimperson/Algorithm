import java.util.*;
class PG_기능개발 {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> q = new ArrayDeque<>();
        for(int i=0; i<progresses.length; i++){
            int cur = 100-progresses[i];
            if(cur % speeds[i] !=0){
                cur = (cur/speeds[i])+1;
            } else{
                cur = cur/speeds[i];
            }
            q.add(cur);
        }
        while(!q.isEmpty()){
            int cur = q.poll();
            int cnt = 1;
            while(!q.isEmpty() && cur>=q.peek()){
                cnt++;
                q.poll();
            }
            answer.add(cnt);
        }
        return answer.stream().mapToInt(x->x).toArray();
    }
}