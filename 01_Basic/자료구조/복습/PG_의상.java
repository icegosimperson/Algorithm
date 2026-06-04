import java.util.*;
class PG_의상 {
    public int solution(String[][] clothes) {
        int answer = 1;
        // 의상 종류별로 개수 cnt
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