import java.util.*;
class PG_12981 {
    public int[] solution(int n, String[] words) {
        Set<String> word = new HashSet<>();
        word.add(words[0]);
        for(int i=0; i<words.length-1; i++){
            String cur = words[i];
            String next = words[i+1];
            if(cur.charAt(cur.length()-1)!=next.charAt(0) || word.contains(next)){
                int loserIdx = i+1;
                return new int[]{(loserIdx%n)+1, (loserIdx/n)+1};
            }
            word.add(next);
        }

        return new int[]{0, 0};
    }
}