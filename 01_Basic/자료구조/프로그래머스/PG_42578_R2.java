import java.util.*;
class PG_42578_R2 {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        for(String[] c : clothes){
            map.put(c[1], map.getOrDefault(c[1], 0)+1);
        }
        for(int cnt : map.values()){
            answer *= cnt+1;
        }
        return answer-1;
    }
}