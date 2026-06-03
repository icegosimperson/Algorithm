class Q2_Shuffle the Array {
    public int[] shuffle(int[] nums, int n) {
        int[] answer = new int[2*n];
        for(int i=0; i<n; i++){
            answer[2*i] = nums[i];
            answer[2*i+1] = nums[i+n];
        }
        return answer;
    }
}
/*
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] x = new int[n];
        int[] y = new int[n];
        int yIdx = 0;
        for(int i=0; i<nums.length; i++){
            if(i<n){
                x[i] = nums[i];
            } else{
                y[yIdx++] = nums[i];
            }
        }
        int[] xy = new int[2*n];
        int idx = 0;
        for(int i=0; i<n; i++){
            xy[idx++] = x[i];
            xy[idx++] = y[i];
        }
        return xy;
    }
}
*/