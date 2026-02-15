/*
비동의 / 동의 
3 2 1 0 1 2 3

동일 -> 사전순
*/
import java.util.*;
class PG_118666 {
    public String solution(String[] survey, int[] choices) {
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();
        char[] type = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        for(char c : type) map.put(c, 0);

        for(int i=0; i<survey.length; i++){
            int score = choices[i];
            if(score < 4){
                char s = survey[i].charAt(0);
                map.put(s, map.get(s) + (4-score));
            } else if(score > 4){
                char s = survey[i].charAt(1);
                map.put(s, map.get(s) + (score-4));
            }
        }

        sb.append(map.get('R') >= map.get('T') ? 'R' : 'T');
        sb.append(map.get('C') >= map.get('F') ? 'C' : 'F');
        sb.append(map.get('J') >= map.get('M') ? 'J' : 'M');
        sb.append(map.get('A') >= map.get('N') ? 'A' : 'N');

        return sb.toString();
    }
}