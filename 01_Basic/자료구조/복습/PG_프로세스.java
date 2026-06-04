import java.util.*;
class Solution {
    private static class Process{
        int index, prior =0;
        Process(int index, int prior){
            this.index = index;
            this.prior = prior;
        }
    }
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Deque<Process> q = new ArrayDeque<>();
        for(int i=0; i<priorities.length; i++){
            q.add(new Process(i, priorities[i]));
        }
        while(!q.isEmpty()){
            Process cur = q.poll();
            boolean flag = false;
            for(Process next : q){
                if(next.prior > cur.prior){
                    flag = true;
                    break;
                }
            }
            if(flag){
                q.add(cur);
            } else{
                answer++;
                if(cur.index==location){
                    return answer;
                }
            }
        }
        return answer;
    }
}