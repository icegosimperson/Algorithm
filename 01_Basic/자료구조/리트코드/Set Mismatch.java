class Set Mismatch {
    public int[] findErrorNums(int[] nums) {
        int len = nums.length;
        int[] count = new int[len+1];
        for(int num : nums){
            count[num]++;
        }
        int dup = -1; int miss = -1;
        for(int i=1; i<=len; i++){
            if(count[i]==2){
                dup = i;
            } else if(count[i]==0){
                miss = i;
            }
        }
        return new int[]{dup, miss};
    }
}