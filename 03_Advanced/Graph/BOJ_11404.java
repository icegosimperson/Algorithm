import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class BOJ_11404{
    static final int INF = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine()); // 도시의 개수
        int m = Integer.parseInt(br.readLine()); // 버스의 개수(간선 개수)

        int[][] graph = new int[n+1][n+1]; // i에서 j까지 ㄱ

        for(int i=0; i<=n; i++){
            for(int j=0; j<=n; j++){
                if(i==j) continue;;
                graph[i][j] = INF;
            }
        }

        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            graph[v][w] = Math.min(graph[v][w], cost);
        }
        floyd(graph, n);
    }
    private static void floyd(int[][] graph, int n){
        for(int k=1; k<=n; k++){
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n; j++){
                    if(graph[i][k] != INF && graph[k][j] != INF) {
                        graph[i][j] = Math.min(graph[i][j], graph[i][k] + graph[k][j]);
                    }
                }
            }
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(graph[i][j]==INF){
                    System.out.print(0 + " ");
                }
                else System.out.print(graph[i][j]+ " ");
            }
            System.out.println();
        }
    }
}