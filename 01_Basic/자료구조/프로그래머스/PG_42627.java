import java.util.*;

class PG_42627 {
    public int solution(int[][] jobs) {
        Arrays.sort(jobs, (a, b)-> a[0]-b[0]); // 요청시간 순
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1]-b[1]); // 소요시간 순
        int completeCnt = 0;
        int jIdx = 0;
        int curTime =0;
        int totalTime = 0;

        while(completeCnt < jobs.length){
            while(jIdx < jobs.length && jobs[jIdx][0] <= curTime){
                pq.add(jobs[jIdx++]);
            }
            if(pq.isEmpty()){
                curTime = jobs[jIdx][0];
            } else{
                int[] job = pq.poll();
                totalTime += curTime + job[1] - job[0];
                curTime += job[1];
                completeCnt++;
            }
        }
        return totalTime/jobs.length;
    }
}