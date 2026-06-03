import java.util.*;

public class PG_12906 {
    public int[] solution(int []arr) {
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i=0; i<arr.length; i++){
            if(deque.isEmpty() || deque.peekLast() !=arr[i]){
                deque.addLast(arr[i]);
            }
        }
        int[] answer = new int[deque.size()];
        int idx = 0;
        while(!deque.isEmpty()){
            answer[idx++] = deque.pollFirst();
        }
        return answer;
    }
}