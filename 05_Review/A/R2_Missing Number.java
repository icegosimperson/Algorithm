class R2_Missing Number {
    public int missingNumber(int[] nums) {
        int n = nums.length+1;
        long sum = n*(n-1)/2;
        for(int i=0; i<nums.length; i++){
            sum -= nums[i];
        }
        return (int) sum;
    }
}