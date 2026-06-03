import java.util.*;
class PG_42626_R3 {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<scoville.length; i++){
            pq.add(scoville[i]);
        }
        // K보다 작은 scoville[i]가 존재하지 않을때까지 반복문
        while(pq.size()>=2 && pq.peek()<K){
            int cur = pq.poll();
            if(cur < K){
                int next = pq.poll();
                int temp = cur + next*2;
                pq.add(temp);
                answer++;
            }
        }
        return pq.peek()>=K ? answer:-1;
    }
}