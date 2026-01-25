import java.util.*;
class PG_42587_R2 {
    static class Process{
        int index;
        int priority;
        Process(int index, int priority){
            this.index = index;
            this.priority = priority;
        }
    }
    public int solution(int[] priorities, int location) {
        Queue<Process> waitQue = new ArrayDeque<>(); // 인덱스 보존용
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;
        for(int i=0; i<priorities.length; i++){
            waitQue.add(new Process(i, priorities[i]));
            pq.add(priorities[i]);
        }
        while(!waitQue.isEmpty()){
            Process cur = waitQue.poll();
            if(cur.priority==pq.peek()){
                answer++;
                pq.poll();
                if(cur.index == location){
                    return answer;
                }
            } else{
                waitQue.add(cur);
            }
        }
        return answer;
    }
}