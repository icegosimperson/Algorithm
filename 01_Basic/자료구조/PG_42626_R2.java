import java.util.*;
class PG_42626_R2 {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int s : scoville) {
            pq.add(s);
        }
        while(pq.size()>=2 && pq.peek()<K){
            int first = pq.poll();
            int second = pq.poll();
            pq.add(first+second*2);
            answer++;
        }
        return pq.peek()>=K ? answer : -1;
    }
}