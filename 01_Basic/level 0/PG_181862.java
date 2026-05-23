import java.util.*;
class PG_181862 {
    public String[] solution(String myStr) {
        StringTokenizer st = new StringTokenizer(myStr, "abc");
        if(st.countTokens()==0){
            return new String[]{"EMPTY"};
        }
        String[] answer = new String[st.countTokens()];
        int idx = 0;
        while(st.hasMoreTokens()){
            answer[idx++] = st.nextToken();
        }
        return answer;
    }
}