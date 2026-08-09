class R2_Move Zeroes {
    public void moveZeroes(int[] nums) {
        int left=0; // 0이 아닌 값이 들어갈 위치 포인터
        for(int right=0; right<nums.length; right++){ // 0이 아닌 변수 포인터
            if(nums[right]!=0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }
    }
}