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
                if(priorities[i] == pq.peek()){
                    pq.poll();
                    answer++;
                    if(i==location){
                        return answer;
                    }
                }
            }
        }
        return answer; // location 값 (index)이 몇번째로 실행되는 지
    }
}