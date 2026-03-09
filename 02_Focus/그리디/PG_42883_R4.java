import java.util.*;
class PG_42883_R4 {
    public String solution(String number, int k) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<number.length(); i++){
            char c = number.charAt(i);
            while(!stack.isEmpty() && stack.peek()<c && k>0){
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
            char c = stack.pop();
            sb.append(c);
        }
        return sb.reverse().toString();
    }
}