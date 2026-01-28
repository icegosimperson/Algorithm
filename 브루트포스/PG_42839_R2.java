import java.util.*;

class PG_42839_R2 {
    HashSet<Integer> set = new HashSet<>();
    public boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public int solution(String numbers) {
        int cnt = 0;
        recrusive("", numbers);
        for(int n : set){
            if(isPrime(n)){
                cnt++;
            }
        }
        return cnt;
    }
    public void recrusive(String pattern, String numbers){
        if(!pattern.equals("")){
            set.add(Integer.parseInt(pattern));
        }
        for(int i=0; i<numbers.length(); i++){
            recrusive(pattern+numbers.charAt(i), numbers.substring(0, i) + numbers.substring(i+1));
        }
    }
}