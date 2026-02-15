import java.util.*;
class PG_12934 {
    public long solution(long n) {
        if(Math.pow((int)Math.sqrt(n), 2)==n){
            return (long) Math.pow((Math.sqrt(n)+1), 2);
        }
        return -1;
    }
}
/*

class Solution {
    public long solution(long n) {
        long temp = (long) Math.sqrt(n);
        if(temp*temp==n) return (temp+1) * (temp+1);
        else return -1;
    }
}
*
/