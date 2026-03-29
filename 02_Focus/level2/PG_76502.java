import java.util.*;

class PG_76502 {
    public int solution(String s) {
        StringBuilder sb = new StringBuilder(s);
        int answer = 0;
        for(int i=0; i<s.length(); i++){
            if(isValid(sb.toString())){
                answer++;
            }
            char c = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(c);
        }
        return answer;
    }
    public boolean isValid(String s){
        Deque<Character> stack = new ArrayDeque<>();
        for(char c : s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
            } else{
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                if(c==')' && top!='(') return false;
                if(c=='}' && top!='{') return false;
                if(c==']' && top!='[') return false;
            }
        }
        return stack.isEmpty();
    }
}