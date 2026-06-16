class 26_Remove Duplicates from Sorted Array {
    public int removeDuplicates(int[] nums) {
        int i=1;
        for(int j=1; j<nums.length; j++){
            if(nums[i-1]!=nums[j]){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}