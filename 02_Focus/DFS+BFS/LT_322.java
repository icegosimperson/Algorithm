import java.util.*;
class LT_322 {
    public int coinChange(int[] coins, int amount) {
        if(amount==0) return 0;
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[amount+1];

        int depth = 0; // 사용한 숫자의 개수
        visited[0] = true;
        queue.offer(0);

        while(!queue.isEmpty()){
            int size = queue.size();
            depth++;
            for(int i=0; i<size; i++){
                int cur = queue.poll();
                for(int c : coins){
                    int next = cur + c;
                    if(next==amount) return depth;
                    if(next < amount && !visited[next]){
                        visited[next] = true; // 방문처리
                        queue.offer(next);
                    }
                }
            }
        }
        return -1;
    }
}