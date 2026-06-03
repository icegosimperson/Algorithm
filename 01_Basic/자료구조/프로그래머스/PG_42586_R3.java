import java.util.*;

class PG_425856_R3 {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
        Queue<Integer> queue = new ArrayDeque<>();
        for(int i=0; i<progresses.length; i++){
            int day = 100-progresses[i];
            int remain = day % speeds[i]==0 ? day/speeds[i] : day/speeds[i]+1;
            queue.add(remain);
        }
        while(!queue.isEmpty()){
            int cnt = 1;
            int cur = queue.poll();
            while(!queue.isEmpty() && queue.peek()<=cur){
                queue.poll();
                cnt++;
            }
            answer.add(cnt);
        }
        return answer.stream().mapToInt(x->x).toArray();
    }
}