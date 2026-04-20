import java.util.*;

class PG_92335 {
    public int solution(int n, int k) {
        int answer = 0;
        String number = toBinary(n, k);
        String[] split = number.split("0");
        for(String s : split){
            if(s.isEmpty()) continue;
            if(isPrime(Long.parseLong(s))){
                answer++;
            }
        }
        return answer;
    }
    public boolean isPrime(long n){
        if(n<2) return false;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public String toBinary(int n, int k){
        StringBuilder sb = new StringBuilder();
        if(n==0) return "0";
        while(n>0){
            sb.append(n%k);
            n /= k;
        }
        return sb.reverse().toString();
    }
}
/*
class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String[] split = Integer.toString(n, k).split("0");
        for(String s : split){
            if(s.isEmpty()) continue;
            if(isPrime(Long.parseLong(s))){
                answer++;
            }
        }
        return answer;
    }
    public boolean isPrime(long n){
        if(n<2) return false;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
 */