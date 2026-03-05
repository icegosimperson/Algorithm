import java.util.*;
class PG_42587_R4 {
    private static class Process{
        int prior=0, index=0;
        Process(int prior, int index){
            this.prior = prior;
            this.index = index;
        }
    }
    public int solution(int[] priorities, int location) {
        Queue<Process> q = new ArrayDeque<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int i=0;
        for(int p : priorities){
            q.add(new Process(p, i++));
            pq.add(p);
        }
        int cnt = 0;
        while(!q.isEmpty()){
            Process cur = q.poll();
            if(cur.prior < pq.peek()){
                q.add(new Process(cur.prior, cur.index));
            } else{
                pq.poll();
                cnt++;
                if(cur.index==location){
                    return cnt;
                }
            }
        }
        return -1;
    }
}