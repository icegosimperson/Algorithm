import java.util.*;
class PG_43165_R2 {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(0);
        for(int num : numbers){
            int size = queue.size();
            for(int i=0; i<size; i++){
                int cur = queue.poll();
                queue.add(cur+num);
                queue.add(cur-num);
            }
        }
        while(!queue.isEmpty()){
            int cur = queue.poll();
            if(cur==target){
                answer++;
            }
        }
        return answer;
    }
}