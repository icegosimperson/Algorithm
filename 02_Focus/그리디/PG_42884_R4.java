import java.util.*;
class PG_42884_R4 {
    public int solution(int n, int[][] costs) {
        int answer = 0;
        Arrays.sort(costs, (a, b)->a[2]-b[2]);
        int[] parent = new int[n+1];
        for(int i=0; i<=n; i++){
            parent[i] = i;
        }
        for(int[] cost : costs){
            int s = cost[0];
            int e = cost[1];
            int c = cost[2];
            if(find(parent, s) != find(parent, e)){
                union(parent, s, e);
                answer += c;
            }
        }
        return answer;
    }
    public void union(int[] parent, int s, int e){
        s = find(parent, s);
        e = find(parent, e);
        parent[e] = s;
    }
    public int find(int[] parent, int x){
        if(parent[x] != x){
            parent[x] = find(parent, parent[x]);
        }
        return parent[x];
    }
}