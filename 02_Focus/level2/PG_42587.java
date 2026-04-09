import java.util.*;
class PG_42587 {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;
        for(int p : priorities){
            pq.add(p);
        }
        while(!pq.isEmpty()){
            for(int i=0; i<priorities.length; i++){
                if(priorities[i]==pq.peek()){
                    answer++;
                    pq.poll();
                    if(i==location){
                        return answer;
                    }
                }
            }
        }
        return answer;
    }
}