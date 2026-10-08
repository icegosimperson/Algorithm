import java.util.*;
public class Main {
    public static ArrayList<Integer>[] graph;
    public static boolean[] visited;
    public static int cnt = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        graph = new ArrayList[n+1];
        visited = new boolean[n+1];
        for(int i=0; i<=n; i++){
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph[u].add(v);
            graph[v].add(u);
        }
        visited[1] = true;
        dfs(1);
        System.out.println(cnt);
    }
    public static void dfs(int cur){
        for(int next : graph[cur]){
            if(!visited[next]){
                visited[next] = true;
                cnt++;
                dfs(next);
            }
        }
    }
}