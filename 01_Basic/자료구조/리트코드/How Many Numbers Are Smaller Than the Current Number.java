class How Many Numbers Are Smaller Than the Current Number {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101];
        int[] answer = new int[nums.length];
        for (int num : nums) {
            count[num]++;
        }
        int sum = 0;
        for (int i = 0; i < count.length; i++) {
            int temp = count[i];
            count[i] = sum;
            sum += temp;
        }
        for (int i = 0; i < nums.length; i++) {
            answer[i] = count[nums[i]];
        }
        return answer;
    }
}
/*
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] answer = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int cnt = 0;
            for(int j=0; j<nums.length; j++){
                if(i!=j && nums[j] < nums[i]){
                    cnt++;
                }
            }
            answer[i] = cnt;
        }
        return answer;
    }
}
 */
/*
import java.util.*;
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] clone = nums.clone();
        int[] answer = new int[nums.length];
        Arrays.sort(clone);
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<clone.length; i++){
            if(!map.containsKey(clone[i])){
                map.put(clone[i], i);
            }
        }
        for(int i=0; i<nums.length; i++){
            answer[i] = map.get(nums[i]);
        }
        return answer;
    }
}
 */