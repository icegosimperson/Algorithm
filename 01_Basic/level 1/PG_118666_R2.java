import java.util.*;

class PG_118666_R2 {
    public String solution(String[] survey, int[] choices) {
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();
        char[][] types = {{'R', 'T'}, {'C', 'F'}, {'J', 'M'}, {'A', 'N'}};

        for(int i=0; i<survey.length; i++){
            int score = choices[i]-4;
            if(score <0){
                char c = survey[i].charAt(0);
                map.put(c, map.getOrDefault(c, 0) + Math.abs(score));
            } else if(score>0){
                char c = survey[i].charAt(1);
                map.put(c, map.getOrDefault(c, 0) + Math.abs(score));
            }
        }
        for(char[] t : types) {
            sb.append(map.getOrDefault(t[0], 0) >= map.getOrDefault(t[1], 0) ? t[0] : t[1]);
        }
        return sb.toString();
    }
}