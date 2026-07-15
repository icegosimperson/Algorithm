class 977. Squares of a Sorted Array {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left=0;
        int right=n-1;
        int pointer=n-1;
        int[] arr = new int[n];
        while(left<=right){
            int lPow = nums[left] * nums[left];
            int rPow = nums[right] * nums[right];
            if(lPow<rPow){
                arr[pointer] = rPow;
                right--;
            } else{
                arr[pointer] = lPow;
                left++;
            }
            pointer--;
        }
        return arr;
    }
}