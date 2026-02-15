/*
중복된 숫자 존재x, 3개씩 골라 소수 만들고 -> return 소수가 되는 경우 개수
- 소수 판별 함수 isPrime 필요
*/
class PG_12977_2 {
    private static boolean isPrime(int n){
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
        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    if(isPrime(sum)) answer++;
                }
            }
        }

        return answer; // 소수가 되는 경우의 개수
    }
}