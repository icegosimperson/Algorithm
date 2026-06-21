import java.util.*;
class 1207_Unique Number of Occurrences {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int a : arr){
            map.put(a, map.getOrDefault(a, 0)+1);
        }
        Set<Integer> count = new HashSet<>(map.values());
        return map.size() == count.size();// 배열 순회하며 원소 별 발생 횟수 저장
    }
}