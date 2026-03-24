import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int answer = 0;
        for(int t : tangerine){
            map.put(t, map.getOrDefault(t, 0)+1);
        }
        List<Integer> list = new ArrayList<>(map.values());
        list.sort(Collections.reverseOrder());
        for(int count : list){
            k -= count;
            answer++;
            if(k<=0){
                break;
            }
        }
        return answer;
    }
}