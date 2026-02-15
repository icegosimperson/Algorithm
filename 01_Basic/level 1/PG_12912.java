import java.util.*;
class PG_12912 {
    public long solution(int a, int b) {
        long answer = 0;
        if(a>=b){
            for(int i=b; i<=a; i++){
                if(a==b) return a;
                answer += (long) i;
            }
        } else{
            for(int i=a; i<=b; i++){
                answer += (long) i;
            }
        }
        return answer;
    }
}