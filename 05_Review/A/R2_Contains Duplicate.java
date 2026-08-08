class R2_Contains Duplicate {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length==1){
            return false;
        }
        Arrays.sort(nums);
        int first = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[first]==nums[i]){
                return true;
            }
            first++;
        }
        return false;
    }
}