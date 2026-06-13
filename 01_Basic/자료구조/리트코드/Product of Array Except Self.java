class Product of Array Except Self {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        answer[0] = 1;
        for(int i=1; i<n; i++){
            answer[i] = answer[i-1] * nums[i-1];
        }
        int right  = 1;
        for(int i=n-1; i>=0; i--){
            answer[i] = answer[i] * right;
            right *= nums[i];
        }
        return answer;
    }
}
/* 나눗셈 사용o -> 조건 위배
class Solution {
    public int[] productExceptSelf(int[] nums) {
        // nums 배열을 조회하며 하나씩 다 곱하면 시간 초과
        int[] answer = new int[nums.length];
        int sum = 1;
        int zeroCnt = 0;
        for(int num : nums){
            if(num==0){
                zeroCnt++;
            } else{
                sum *= num;
            }
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0 && zeroCnt>0 || zeroCnt==nums.length){
                answer[i] = 0;
            } else if(nums[i]==0){
                if(zeroCnt>1) answer[i] = 0;
                else answer[i] = sum;
            } else{
                answer[i] = sum / nums[i];
            }
        }
        return answer;
    }
}
 */