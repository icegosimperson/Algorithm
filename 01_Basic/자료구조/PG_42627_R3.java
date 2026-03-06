import java.util.*;
class PG_42627_R3 {
    private static class Job implements Comparable<Job>{
        int id, request, time;
        Job(int id, int request, int time){
            this.id = id;
            this.request = request;
            this.time = time;
        }
        @Override
        public int compareTo(Job j){
            if(this.time != j.time){
                return this.time - j.time;
            }
            if(this.request != j.request){
                return this.request - j.request;
            }
            return this.id - j.id;
        }
    }
    public int solution(int[][] jobs) {
        PriorityQueue<Job> pq = new PriorityQueue<>();
        Arrays.sort(jobs, (a, b)->a[0]-b[0]);
        int total = 0;
        int curTime = 0;
        int idx = 0;
        while(!pq.isEmpty() || idx < jobs.length){
            while(idx<jobs.length && jobs[idx][0] <= curTime){
                pq.add(new Job(idx, jobs[idx][0], jobs[idx][1]));
                idx++;
            }
            if(pq.isEmpty()){
                curTime = jobs[idx][0];
            } else{
                Job cur = pq.poll();
                total += (curTime + cur.time - cur.request);
                curTime += cur.time;
            }
        }
        return total / jobs.length;
    }
}