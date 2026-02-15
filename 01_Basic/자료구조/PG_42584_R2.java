import java.util.*;

class PG_42584_R2 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i=0; i<prices.length; i++){
            while(!deque.isEmpty() && prices[deque.peek()] > prices[i]){
                int Idx = deque.pop();
                answer[Idx] = i-Idx;
            }
            deque.push(i);
        }
        while(!deque.isEmpty()){
            int index = deque.pop();
            answer[index] = prices.length - 1 - index;
        }
        return answer;
    }
}