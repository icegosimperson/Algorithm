import java.util.*;
class PG_네트워크 {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        ArrayList<Integer>[] graph = new ArrayList[n+1];
        boolean[] visited = new boolean[n];
        for(int i=0; i<n; i++){
            graph[i] = new ArrayList<>();
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i!=j && computers[i][j]==1){
                    graph[i].add(j);
                }
            }
        }
        for(int i=0; i<n; i++){
            if(!visited[i]){
                dfs(i, graph, visited);
                answer++;
            }
        }
        return answer;
    }
    public void dfs(int index, ArrayList<Integer>[] graph, boolean[] visited){
        visited[index] = true;
        for(int next : graph[index]){
            if(!visited[next]){
                dfs(next, graph, visited);
            }
        }
    }
}