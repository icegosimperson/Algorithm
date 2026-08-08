class R6. Remove Duplicates from Sorted Array {
    public int removeDuplicates(int[] nums) {
        int idx=0; // 유일한 원소의 마지막 위치
        for(int i=1; i<nums.length; i++){
            if(nums[idx]!=nums[i]){
                idx++;
                nums[idx]=nums[i];
            }
        }
        return idx+1; // return 원소의 개수
    }
}