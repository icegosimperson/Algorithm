class PG_77884 {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left; i<=right; i++){
            if(i%Math.sqrt(i)==0){ // 제곱수인 경우에는 약수의 개수가 홀수 개
                answer -= i;
            } else{
                answer += i;
            }
        }
        return answer;
    }
}

/*
import java.util.*;

class Solution {
    private static int isPrime(int n){
        // 약수 구하기 ex) 13
        int cnt = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                cnt++;
            }
        }
        return cnt;
    }
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left; i<=right; i++){
            int cnt = isPrime(i);
            if(cnt%2==0){
                answer += i;
            } else{
                answer -= i;
            }
        }
        return answer;
    }
}
*/