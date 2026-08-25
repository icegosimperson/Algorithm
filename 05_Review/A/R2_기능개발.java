import java.util.*;
class R2_기능개발 {
    public int[] solution(int[] progresses, int[] speeds) {
        Deque<Integer> queue = new ArrayDeque<>();
        for(int i=0; i<progresses.length; i++){
            int cur = 100 - progresses[i];
            queue.add((cur%speeds[i]==0) ? cur/speeds[i] : cur/speeds[i]+1);
        }
        ArrayList<Integer> result = new ArrayList<>();
        while(!queue.isEmpty()){
            int cur = queue.poll();
            int count=1;
            while(!queue.isEmpty() && cur>=queue.peek()){
                count++;
                queue.poll();
            }
            result.add(count);
        }
        int[] answer = new int[result.size()];
        for(int i=0; i<result.size(); i++){
            answer[i] = result.get(i);
        }
        return answer;
    }
}