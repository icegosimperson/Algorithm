class PG_12928 {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=Math.sqrt(n); i++){
            if(n%i==0){
                answer += i;
                if(i!=n/i) answer += n/i;
            }
        }
        return answer;
    }
}

/*
class Solution {
    static int answer = 0;
    private static void isPrime(int n){
        for(int i=1; i<=n; i++){
            if(n%i==0){
                answer += i;
            }
        }
    }
    public int solution(int n) {
        isPrime(n);
        return answer;
    }
}
*/