// You must delete one element
class 1493_Longest Subarray of 1's After Deleting One Element {
    public int longestSubarray(int[] nums) {
        int start=0;
        int max=0;
        int cnt=0;
        for(int end=0; end<nums.length; end++){
            if(nums[end]==0){
                cnt++;
            }
            while(cnt>1){
                if(nums[start]==0){
                    cnt--;
                }
                start++;
            }
            max = Math.max(max, end-start);
        }
        return max;
    }
}