import java.util.*;
class R2_디스크 컨트롤러 {
    class Process implements Comparable<Process>{
        int number = 0;
        int request = 0;
        int during = 0;
        Process(int number, int request, int during){
            this.number = number;
            this.request = request;
            this.during = during;
        }
        @Override
        public int compareTo(Process p){
            if(p.during==this.during){
                if(this.request==p.request){
                    return this.number - p.number;
                }
                return this.request - p.request;
            }
            return this.during - p.during;
        }
    }
    public int solution(int[][] jobs) {
        PriorityQueue<Process> waitQ = new PriorityQueue<>();
        Process[] p = new Process[jobs.length];
        for(int i=0; i<jobs.length; i++){
            p[i] = new Process(i, jobs[i][0], jobs[i][1]);
        }
        Arrays.sort(p, (a, b)-> a.request - b.request);
        int index = 0;
        int time = 0;
        int completed = 0;
        int total =  0;
        while(completed<jobs.length){
            while(index<p.length && p[index].request <= time){
                waitQ.add(p[index]);
                index++;
            }
            if(waitQ.isEmpty()){
                time = p[index].request;
                continue;
            }
            Process cur = waitQ.poll();
            time += cur.during;
            total += (time - cur.request);
            completed++;
        }
        return total/jobs.length;
    }
}