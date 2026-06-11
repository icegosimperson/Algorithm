class 283_Move Zeroes{
    public void moveZeroes(int[] nums) {
        int left = 0;
        for(int right=0; right<nums.length; right++){
            if(nums[right]!=0){
                int swap = nums[right];
                nums[right] = nums[left];
                nums[left] = swap;
                left++;
            }
        }
    }
}