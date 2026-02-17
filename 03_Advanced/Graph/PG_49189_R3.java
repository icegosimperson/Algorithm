import java.util.*;
class PG_49189_R3 {
    public int solution(int n, int[][] edge) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<>());
        }
        for(int[] e : edge){
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }
        Queue<Integer> queue = new ArrayDeque<>();
        int[] distance = new int[n+1];
        queue.add(1);
        distance[1] = 1; // 시작점
        int maxDist = 0;
        while(!queue.isEmpty()){
            int cur = queue.poll();

            for(int next : graph.get(cur)){
                if(distance[next]==0){
                    distance[next] = distance[cur] +1;
                    maxDist = Math.max(maxDist, distance[next]);
                    queue.add(next);
                }
            }
        }
        int cnt = 0;
        for(int i=1; i<=n; i++){
            if(distance[i]==maxDist){
                cnt++;
            }
        }
        return cnt;
    }
}