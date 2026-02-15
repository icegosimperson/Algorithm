import java.util.*;

class PG_160586 {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character, Integer> map = new HashMap<>(); // 최소 클릭 수 저장

        for(int i=0; i<keymap.length; i++){
            for(int j=0; j<keymap[i].length(); j++){ // ["ABCD", "AABB"]
                char cur = keymap[i].charAt(j);
                int cnt = j+1;
                if(map.containsKey(cur)){
                    map.put(cur, Math.min(map.get(cur), cnt));
                } else{
                    map.put(cur, cnt);
                }
            }
        }

        for(int i=0; i<targets.length; i++){
            int sum = 0;
            for(int j=0; j<targets[i].length(); j++){
                char cur = targets[i].charAt(j);
                if(map.containsKey(cur)){
                    sum += map.get(cur);
                } else{
                    sum = -1;
                    break;
                }
            }
            answer[i] = sum;
        }
        return answer;
    }
}