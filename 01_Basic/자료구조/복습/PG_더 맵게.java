import java.util.*;
class PG_더 맵게 {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int answer = 0;
        for(int s : scoville){
            pq.add(s);
        }
        while(pq.peek()<K){
            if(pq.size()<2){
                return -1;
            }
            int first = pq.poll();
            int second = pq.poll();
            pq.add(first+second*2);
            answer++;
        }
        return answer;
    }
}