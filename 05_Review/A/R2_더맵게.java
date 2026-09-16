import java.util.*;
class R2_더맵게 {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        // 첫번째 최솟값
        // 두번째 최솟값 *2
        // int[] 배열 정렬 -> 시간 초과
        // 우선순위 큐 구현 PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // 반복 조건 : 모든 원소가 >= K
        for(int s : scoville){
            pq.add(s);
        }
        while(pq.peek()<K){
            if(pq.size()<2){
                return -1;
            }
            int a = pq.poll();
            int b = pq.poll();
            int k = a + (b*2);
            pq.add(k);
            answer++;
        }

        return answer; // K이상으로 만들기 위한 최소 횟수
    }
}