import java.util.*;

class PG_11866_2 {
    public String solution(String[] survey, int[] choices) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<survey.length; i++){
            int score = choices[i]-4;
            if(score==4) continue;

            char type = (score<0) ? survey[i].charAt(0) : survey[i].charAt(1);
            map.put(type, map.getOrDefault(type, 0) + Math.abs(score));
        }
        StringBuilder sb = new StringBuilder();
        String[] types = {"RT", "CF", "JM", "AN"};

        for(String t : types){
            char c1 = t.charAt(0); char c2 = t.charAt(1);
            sb.append(map.getOrDefault(c1, 0)>=map.getOrDefault(c2, 0) ? c1 : c2);
        }
        return sb.toString();
    }
}