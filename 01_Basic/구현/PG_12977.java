/*
주어진 숫자 중 3개의 수가 더했을 때 소수가 되는 경우의 개수 구하기
1) nums 배열에서 숫자 3개 구하기 -> 조합?
2) 소수 판별  
*/
class PG_12977 {
    public static boolean isValid(int n){
        if(n<2) return false;

        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public int solution(int[] nums) {
        int answer = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    if(isValid(nums[i] + nums[j] + nums[k])){
                        answer++;
                    }
                }
            }
        }

        return answer;

    }
}