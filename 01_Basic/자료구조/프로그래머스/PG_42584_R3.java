import java.util.*;

class PG_42584_R3 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for(int i=0; i<prices.length; i++){
            while(!deque.isEmpty() && prices[deque.peekLast()] > prices[i]){
                int pIdx = deque.pollLast();
                answer[pIdx] = i-pIdx;
            }
            deque.addLast(i);
        }
        while(!deque.isEmpty()){
            int Idx = deque.pollFirst();
            answer[Idx] = prices.length - 1 - Idx;
        }
        return answer;
    }
}