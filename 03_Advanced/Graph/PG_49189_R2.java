import java.util.*;
class PG_49189_R2 {
    ArrayList<Integer>[] list;
    public int solution(int n, int[][] edge) {
        list = new ArrayList[n+1];
        for(int i=0; i<=n; i++){
            list[i] = new ArrayList<>();
        }
        for(int[] e : edge){
            list[e[0]].add(e[1]);
            list[e[1]].add(e[0]);
        }
        return bfs(n);
    }
    public int bfs(int n){
        Queue<int[]> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[n+1];
        queue.add(new int[]{1, 0});
        visited[1] = true;
        int cnt = 0;
        int maxDist = 0;
        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            int node = cur[0];
            int dist = cur[1];
            if(dist>maxDist){
                maxDist = dist;
                cnt=1;
            } else if(maxDist==dist){
                cnt++;
            }
            for(int next : list[node]){
                if(!visited[next]){
                    visited[next] = true;
                    queue.add(new int[]{next, dist+1});
                }
            }
        }
        return cnt;
    }
}