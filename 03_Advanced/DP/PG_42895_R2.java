import java.util.*;
class PG_42895_R2 {
    public int solution(int N, int number) {
        if(N==number) return 1;
        List<Set<Integer>> dp = new ArrayList<>();
        for(int i=0; i<=8; i++){
            dp.add(new HashSet<>());
        }
        dp.get(1).add(N);
        for(int i=2; i<=8; i++){
            Set<Integer> cur = dp.get(i);
            int connect = Integer.parseInt(String.valueOf(N).repeat(i));
            cur.add(connect);
            for(int j=0; j<i; j++){
                Set<Integer> prev = dp.get(j);
                Set<Integer> post = dp.get(i-j);
                for(int a : prev){
                    for(int b : post){
                        cur.add(a+b);
                        cur.add(a-b);
                        cur.add(a*b);
                        if(b!=0) cur.add(a/b);
                    }
                }
            }
            if(cur.contains(number)) return i;
        }
        return -1;
    }
}