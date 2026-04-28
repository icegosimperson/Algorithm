import java.util.*;
class PG_49993 {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for(String s : skill_trees){
            ArrayDeque<Character> q = new ArrayDeque<>();
            for(char c : skill.toCharArray()){
                q.add(c);
            }
            boolean flag = true;
            for(int i=0; i<s.length(); i++){
                char cur = s.charAt(i);
                if(skill.indexOf(cur) != -1){
                    if(q.peek()==cur){
                        q.pop();
                    } else{
                        flag = false;
                        break;
                    }
                }
            }
            if(flag) answer++;

        }
        return answer;
    }
}