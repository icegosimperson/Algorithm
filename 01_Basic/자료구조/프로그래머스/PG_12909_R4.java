import java.util.*;
class PG_12909_R4 {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char cur = s.charAt(i);
            if(cur=='('){
                stack.push(cur);
            } else{
                if(stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}