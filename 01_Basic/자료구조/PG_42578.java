import java.util.*;
class PG_42578 {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();
        for(String[] c : clothes){
            String type = c[1];
            map.put(type, map.getOrDefault(type, 0)+1);
        }
        int answer = 1;
        for(int cnt : map.values()){
            answer *= cnt + 1;
        }
        return answer-1; // 서로 다른 옷의 조합 수
    }
}