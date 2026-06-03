import java.util.*;
class PG_12909_R3 {
    boolean solution(String s) {
        Stack<Character> stacks = new Stack<>();
        stacks.push(s.charAt(0));
        for(int i=1; i<s.length(); i++){
            char cur = s.charAt(i);
            if(stacks.peek()=='(' && cur==')'){
                stacks.pop();
            }
        }
        if(stacks.size()==0) return true;
        else return false;
    }
}