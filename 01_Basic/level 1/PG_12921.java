class PG_12921 {
    private static boolean isPrime(int num){
        if(num<2) return false;
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i==0) return false;
        }
        return true;
    }
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            if(isPrime(i)) answer++;
        }
        return answer;
    }
}