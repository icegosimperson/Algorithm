class PG_77884 {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left; i<=right; i++){
            if(i%Math.sqrt(i)==0){ // 제곱수의 약수의 개수 % 2 == 1
                answer -= i;
            } else answer += i;
        }
        return answer;
    }
}
/*
class Solution {
    // 약수 구하는 메서드
    public int countPrime(int num){
        int cnt = 0;
        for(int i=1; i<=num; i++){
            if(num%i==0) cnt++;
        }
        return cnt;
    }
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left; i<=right; i++){
            int count = countPrime(i);
            if(count%2==0){
                answer += i;
            } else answer -= i;
        }
        return answer;
    }
}
*/