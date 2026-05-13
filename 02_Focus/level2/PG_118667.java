import java.util.*;
class PG_118667 {
    public int solution(int[] queue1, int[] queue2) {
        long total = 0;
        Queue<Long> q1 = new ArrayDeque<>();
        Queue<Long> q2 = new ArrayDeque<>();
        long q1Sum = 0; long q2Sum = 0;
        for(int i=0; i<queue1.length; i++){
            q1Sum += queue1[i]; q1.add((long)queue1[i]);
            q2Sum += queue2[i]; q2.add((long)queue2[i]);
        }
        total = q1Sum + q2Sum;
        if(total%2!=0) return -1;
        int cnt = 0;
        long limit = queue1.length * 4;
        while(cnt<=limit){
            if(q1Sum==(total/2)){
                return cnt;
            }
            if(q1Sum > q2Sum){
                long tmp = q1.poll();
                q1Sum -= tmp;
                q2.add(tmp);
                q2Sum += tmp;
            } else{
                long tmp = q2.poll();
                q2Sum -= tmp;
                q1.add(tmp);
                q1Sum += tmp;
            }
            cnt++;
        }
        return -1;
    }
}