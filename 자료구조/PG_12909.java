import java.util.*;

class PG_12909 {
    boolean solution(String s) {
        Deque<Character> deque = new ArrayDeque<>();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='(') deque.add(c);
            else{ // c == ')'
                if(deque.isEmpty()) return false;
                deque.pop();
            }
        }


        return deque.isEmpty();
    }
}