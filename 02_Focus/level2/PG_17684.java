import java.util.*;
class PG_17684 {
    public int[] solution(String msg) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        int idx = 1;
        for(char c = 'A'; c <= 'Z'; c++){
            map.put(String.valueOf(c), idx++);
        }
        int i = 0;
        while(i<msg.length()){
            String w = "";
            for(int j=i+1; j<=msg.length(); j++){
                String cur = msg.substring(i, j);
                if(map.containsKey(cur)){
                    w = cur;
                } else{
                    map.put(cur, idx++);
                    break;
                }
            }
            answer.add(map.get(w));
            i += w.length();
        }
        return answer.stream().mapToInt(x->x).toArray();
    }
}