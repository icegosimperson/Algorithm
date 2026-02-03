import java.util.*;

class PG_42861 {
    public int[] parent;
    public int solution(int n, int[][] costs) {
        int answer = 0;
        parent = new int[n];
        for(int i=0; i<n; i++){
            parent[i] = i;
        }
        Arrays.sort(costs, (a, b) -> Integer.compare(a[2], b[2]));
        for(int[] edges : costs){
            int from = edges[0];
            int to = edges[1];
            int cost = edges[2];
            if(find(from) != find(to)){
                union(from, to);
                answer += cost;
            }
        }
        return answer;
    }
    public int find(int x){
        if(parent[x] == x) return x;
        return parent[x] = find(parent[x]);
    }
    public void union(int a, int b){
        int rootA = parent[a];
        int rootB = parent[b];
        if(rootA != rootB){
            parent[rootB] = rootA;
        }
    }
}