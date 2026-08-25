import java.util.*;

public class R2_같은 숫자는 싫어 {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<arr.length; i++){
            int cur = arr[i];
            if(!stack.isEmpty()){
                if(stack.peek()==cur){
                    continue;
                }
            }
            stack.push(cur);
        }
        int[] answer = new int[stack.size()];
        int idx=stack.size()-1;
        while(!stack.isEmpty()){
            answer[idx--] = stack.pop();
        }
        return answer;
    }
}