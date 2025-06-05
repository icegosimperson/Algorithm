import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class BOJ_1389{
    static final int INF = 1_000_000_000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 유저의 수
        int M = Integer.parseInt(st.nextToken()); // 친구 관계의 수
        int[][] graph = new int[N + 1][N+ 1];

        for(int i=1; i<=N; i++){
            Arrays.fill(graph[i],INF);
            graph[i][i] = 0; // 자기 자신과의 거리 0
        }

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = graph[b][a] = 1; // 양방향 그래프
        }

        for(int k=1; k<=N; k++){
            for(int i=1; i<=N; i++){
                for(int j=1; j<=N; j++){
                    if(graph[i][k] + graph[k][j] < graph[i][j]){
                        graph[i][j] = graph[i][k] + graph[k][j];
                    }
                }
            }
        }
        int ans = 0;
        int min = INF;
        for(int i=1; i<=N; i++){
            int total = 0;
            for(int j=1; j<=N; j++){
                total += graph[i][j];
            }
            if(total < min){
                min = total;
                ans = i;
            }
        }
        System.out.println(ans);
    }
}