import java.util.*;

class PG_42584 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i=0; i<prices.length; i++){ // 하락한 주식 탐색
            while(!deque.isEmpty() && prices[deque.peek()] > prices[i]){
                int idx = deque.pop();
                answer[idx] = i-idx;
            }
            deque.push(i);
        }
        while(!deque.isEmpty()){ // 나머지
            int idx = deque.pop();
            answer[idx] = prices.length -1 -idx;
        }
        return answer; // 가격이 떨어지지 않은 기간
    }
}