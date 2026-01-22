import java.util.*;

class PG_42586_R2 {
    public int[] solution(int[] progresses, int[] speeds) {
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i=0; i<progresses.length; i++){
            int days = (100-progresses[i] + speeds[i]-1) / speeds[i];
            deque.add(days);
        }
        List<Integer> result = new ArrayList<>();
        while(!deque.isEmpty()){
            int standard = deque.poll();
            int cnt = 1;
            while(!deque.isEmpty() && deque.peek() <= standard){
                deque.poll();
                cnt++;
            }
            result.add(cnt);
        }
        return result.stream().mapToInt(x->x).toArray();

    }
}