import java.util.*;

class PG_42839 {
    HashSet<Integer> set = new HashSet<>();
    public boolean isPrime(int n){
        if(n<2) return false;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public int solution(String numbers) {
        recursive("", numbers);
        int cnt = 0;
        for(int n : set){
            if(isPrime(n)){
                cnt++;
            }
        }
        return cnt; // 만들 수 있는 소수 개수
    }
    public void recursive(String comb, String others){
        if(!comb.equals("")){
            set.add(Integer.parseInt(comb));
        }
        for(int i=0; i<others.length(); i++){
            recursive(comb + others.charAt(i), others.substring(0, i) + others.substring(i+1));
        }
    }
}