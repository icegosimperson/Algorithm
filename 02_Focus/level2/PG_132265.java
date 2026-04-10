import java.util.*;
class PG_132265 {
    public int solution(int[] topping) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> countSet = new HashSet<>();
        for(int t : topping){
            map.put(t, map.getOrDefault(t, 0)+1);
        }
        for(int t : topping){
            countSet.add(t);
            map.put(t, map.get(t)-1);
            if(map.get(t)==0){
                map.remove(t);
            }
            if(countSet.size()==map.size()){
                answer++;
            }
        }
        return answer;
    }
}