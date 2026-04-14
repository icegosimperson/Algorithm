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

/*
import java.util.*;
class Solution {
    public int[] solution(String s) {
        s = s.substring(2, s.length()-2);
        String[] split = s.split("\\},\\{"); // }, { 기준으로 자르기
        Arrays.sort(split, (a, b) -> a.length() - b.length());
        List<Integer> answer = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(String str : split){
            String[] nums = str.split(",");
            for(String n : nums){
                int num = Integer.parseInt(n);
                if(!set.contains(num)){
                    set.add(num);
                    answer.add(num);
                }
            }
        }
        return answer.stream().mapToInt(x->x).toArray();
    }
}
 */