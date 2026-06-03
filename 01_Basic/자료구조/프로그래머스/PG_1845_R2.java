import java.util.*;

class PG_1845_R2 {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums) set.add(n);
        return Math.min(set.size(), nums.length/2);
    }
}