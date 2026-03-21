class PG_12924 {
    public int solution(int n) {
        int answer = 0;
        int sum = 1;
        int left = 1;
        int right = 1;
        while(left<=right){
            if(sum==n){
                answer++;
                right++;
                sum += right;
            } else if(sum < n){
                right++;
                sum += right;
            } else{
                sum -= left;
                left++;
            }
        }
        return answer;
    }
}
/*
class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            int sum = 0;
            for(int j=i; j<=n; j++){
                sum += j;
                if(sum==n){
                    answer++;
                    break;
                } else if(sum > n){
                    break;
                }
            }
        }
        return answer;
    }
}
 */