import java.util.*;
class PG_12973 {
    public int solution(String s){
        Deque<Character> stack = new ArrayDeque<>();
        for(char c : s.toCharArray()){
            if(!stack.isEmpty() && stack.peekLast()==c){
                stack.pollLast();
            } else{
                stack.addLast(c);
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}
/*
import java.util.*;
class Solution{
    public int solution(String s){
        Deque<Character> q = new ArrayDeque<>();
        for(int i=0; i<s.length(); i++){
            char cur = s.charAt(i);
            if(!q.isEmpty() && q.peekLast()==cur){
                q.pollLast();
            }
            else{
                q.addLast(cur);
            }
        }
        return q.isEmpty() ? 1 : 0;
    }
}
*/