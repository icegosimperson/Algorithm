import java.util.*;
class PG_1845_R5 {
    public int solution(int[] nums) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        answer = Math.min(set.size(), nums.length/2);
        return answer;
    }
}