import java.util.*;
class R2_올바른 괄호 {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='('){
                stack.push('(');
            } else{
                if(stack.isEmpty()){
                    return false;
                }else{
                    if(stack.peek()=='('){
                        stack.pop();
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}