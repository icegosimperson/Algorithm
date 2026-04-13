import java.util.*;
class PG_64065 {
    public int[] solution(String s) {
        HashMap<Integer, Integer> map = new HashMap<>();
        String[] arr = s.replaceAll("[{}]", "").split(",");
        for(String n : arr){
            int nums = Integer.parseInt(n.trim());
            map.put(nums, map.getOrDefault(nums, 0)+1);
        }
        ArrayList<Integer> answer = new ArrayList<>(map.keySet());
        answer.sort((a, b) -> map.get(b) - map.get(a));
        return answer.stream().mapToInt(x->x).toArray();
    }
}