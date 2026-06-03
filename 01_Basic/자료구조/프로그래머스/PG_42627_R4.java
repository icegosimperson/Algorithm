import java.util.*;
class PG_42627_R4 {
    private static class Job implements Comparable<Job>{
        int num=0,request=0, during=0;
        Job(int num, int request, int during){
            this.num = num;
            this.request = request;
            this.during = during;
        }
        @Override
        public int compareTo(Job j){
            if(this.during!=j.during){
                return this.during-j.during;
            }
            if(this.request != j.request){
                return this.request - j.request;
            }
            return this.num - j.num;
        }
    }
    public int solution(int[][] jobs) {
        int answer = 0;
        int total = 0;
        int curTime = 0;
        int idx = 0;
        Arrays.sort(jobs, (a, b)->a[0]-b[0]);
        PriorityQueue<Job> pq = new PriorityQueue<>();

        while(!pq.isEmpty() || idx < jobs.length){
            while(idx < jobs.length && jobs[idx][0] <= curTime){
                pq.add(new Job(idx, jobs[idx][0], jobs[idx][1]));
                idx++;
            }
            if(pq.isEmpty()){
                curTime = jobs[idx][0];
            } else{
                Job cur = pq.poll();
                total += (curTime + cur.during - cur.request);
                curTime += cur.during;
            }
        }
        return total/jobs.length;
    }
}