import java.util.*;

class PG_42883_R5 {
    public String solution(String number, int k) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<number.length(); i++){
            char c = number.charAt(i);
            while(!stack.isEmpty() && stack.peek() < c && k>0) {
                stack.pop();
                k--;
            }
            stack.push(c);
        }
        while(k>0){
            stack.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            char cur = stack.pop();
            sb.append(cur);
        }
        return sb.reverse().toString();
    }
}