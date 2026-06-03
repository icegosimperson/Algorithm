import java.util.*;

public class PG_12906_R2 {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>(); // 연속할 경우에는 숫자 넣지X
        for(int n : arr){
            if(deque.isEmpty() || deque.peekFirst() != n){
                deque.push(n);
            }
        }
        while(!deque.isEmpty()){
            list.add(deque.pollLast());
        }
        return list.stream().mapToInt(x->x).toArray();
    }
}