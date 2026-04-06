import java.util.*;

class PG_42586 {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Deque<Integer> q = new ArrayDeque<>();
        for(int i=0; i<progresses.length; i++){
            int cur = 100-progresses[i];
            int remain = (cur%speeds[i]==0) ? cur/speeds[i] : cur/speeds[i]+1;
            q.add(remain);
        }
        while(!q.isEmpty()){
            int cnt = 1;
            int cur = q.poll();
            while(!q.isEmpty() && q.peek()<=cur){
                q.poll();
                cnt++;
            }
            answer.add(cnt);
        }
        return answer.stream().mapToInt(x->x).toArray(); // toArray().stream()
    }
}