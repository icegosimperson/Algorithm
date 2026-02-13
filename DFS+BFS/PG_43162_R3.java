import java.util.*;
class PG_43162_R3 {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];
        for(int i=0; i<n; i++){
            if(!visited[i]){
                answer++;
                bfs(i, computers, visited);
            }
        }
        return answer;
    }
    public void bfs(int i, int[][] computers, boolean[] visited){
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(i);
        visited[i] = true;
        while(!queue.isEmpty()){
            Integer j = queue.poll();
            for(int k=0; k<computers.length; k++){
                if(!visited[k] && computers[j][k]==1){
                    visited[k] = true;
                    queue.add(k);
                }
            }
        }
    }
}