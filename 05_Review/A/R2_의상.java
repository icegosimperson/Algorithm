import java.util.*;
class R2_의상 {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        for(String[] c : clothes){
            map.put(c[1], map.getOrDefault(c[1], 0)+1);
        }
        for(int c : map.values()){
            answer *= (c+1);
        }
        return answer-1;
    }
}