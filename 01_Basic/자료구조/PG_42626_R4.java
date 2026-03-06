import java.util.*;
class PG_42626_R4 {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int s : scoville){
            pq.add(s);
        }
        // [1, 2, 3, 9, 10, 12]
        while(pq.size()>=2 && pq.peek()<K){ // 조건 중 하나라도 false -> 종료
            int cur = pq.poll(); // 1
            int temp = cur + pq.poll() *2; // 1 + 2*2 = 5
            pq.add(temp);
            answer++;
        }
        return pq.peek()>=K ? answer : -1;
    }
}