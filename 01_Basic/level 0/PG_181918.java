import java.util.*;
class PG_181918 {
    public int[] solution(int[] arr) {
        Deque<Integer> q = new ArrayDeque<>();
        int i = 0;
        while(i<arr.length){
            if(q.isEmpty()){
                q.addLast(arr[i]);
                i++;
            } else{
                if(q.peekLast() < arr[i]){
                    q.addLast(arr[i]);
                    i++;
                } else{
                    q.pollLast();
                }
            }
        }
        return q.stream().mapToInt(x->x).toArray();
    }
}
/*
import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        for(int n : arr){
            while(!stk.isEmpty() && n <= stk.peek()){
                stk.pop();
            }
            stk.push(n);
        }
        return stk.stream().mapToInt(x->x).toArray();
    }
}
 */