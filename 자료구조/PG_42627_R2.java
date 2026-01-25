import java.util.*;

class PG_42627_R2 {
    static class Job implements Comparable<Job>{
        int id; // 작업 번호
        int requestTime; // 요청 시각
        int duration; // 소요 시간
        Job(int id, int requestTime, int duration){
            this.id = id;
            this.requestTime = requestTime;
            this.duration = duration;
        }
        @Override
        public int compareTo(Job o){
            // [1순위] 소요 시간이 짧은 것
            if (this.duration != o.duration) {
                return this.duration - o.duration;
            }
            // [2순위] 요청 시각이 빠른 것
            if (this.requestTime != o.requestTime) {
                return this.requestTime - o.requestTime;
            }
            // [3순위] 작업 번호가 작은 것
            return this.id - o.id;
        }
    }
    public int solution(int[][] jobs) {
        Arrays.sort(jobs, (a, b)-> a[0] - b[0]); // 요청 시간 순 정렬
        PriorityQueue<Job> pq = new PriorityQueue<>();
        int curTime = 0;
        int jIdx = 0;
        int complete = 0;
        int totalTime = 0;
        while(complete < jobs.length){
            while(jIdx < jobs.length && jobs[jIdx][0] <= curTime){
                pq.add(new Job(jIdx, jobs[jIdx][0], jobs[jIdx][1]));
                jIdx++;
            }
            if(pq.isEmpty()){
                curTime = jobs[jIdx][0];
            } else{
                Job cur = pq.poll();
                totalTime += (curTime + cur.duration - cur.requestTime);
                curTime += cur.duration;
                complete++;
            }
        }
        return totalTime/jobs.length;
    }
}