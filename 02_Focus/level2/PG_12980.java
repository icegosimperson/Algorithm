import java.util.*;

public class PG_12980 {
    public int solution(int n) {
        int ans = 0;
        while(n>0){
            if(n%2==0){
                n /= 2;
            } else {
                n-=1;
                ans++;
            }
        }
        return ans; // 건전지 사용량 최솟값
    }
}