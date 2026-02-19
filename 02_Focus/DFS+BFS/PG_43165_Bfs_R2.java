import java.util.*;

class PG_43165_Bfs_R2 {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(numbers[0]);
        queue.add(-numbers[0]);
        for(int i=1; i<numbers.length; i++){
            int size = queue.size();
            for(int j=0; j<size; j++){
                int cur = queue.poll();
                queue.add(cur + numbers[i]);
                queue.add(cur - numbers[i]);
            }
        }
        while(!queue.isEmpty()){
            if(queue.poll()==target){
                answer++;
            }
        }
        return answer;
    }
}