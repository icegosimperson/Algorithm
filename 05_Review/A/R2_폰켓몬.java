import java.util.*;
class R2_폰켓몬 {
    public int solution(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        return n/2 > set.size() ? set.size() : n/2;
    }
}