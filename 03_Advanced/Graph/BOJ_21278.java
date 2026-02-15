import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
모든 건물에서 가까운 치킨집까지 왕복 하는 최단 시간의 총합을 최소화
모든 정점 간 최단 거리 -> 플로이드 와샬
주의 해야할 조건 : 만약 건물 조합이 다양하게 가능하면, 작은 번호가 더 작은 것을, 작은 번호가 같다면 큰 번호가 더 작은 걸 출력
우선순위 큐 사용 X -> 정점들을 다 구해뒀기 때문
최소 거리 조합이 여러개일 경우 -> 사전 순으로 갱신
 */
class HW_21278{
    static final int INF = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 건물의 개수 (노드의 개수)
        int M = Integer.parseInt(st.nextToken()); // 도로의 개수 (간선의 개수)

        int[][] graph = new int[N+1][N+1];

        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                if(i==j) continue;
                graph[i][j] = INF;
            }
        }

        for(int i=0; i<M; i++){ // 도로의 정보, 양방향 그래프, 간선 비용(X, 1로 처리)
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            graph[A][B] = 1;
            graph[B][A] = 1;
        }
        floyd(graph, N);

        int minDist = INF; // 최단 거리
        int x=0, y=0;
        for(int i=1; i<=N; i++){
            for(int j=i+1; j<=N; j++){
                int dist = 0;
                for(int k=1; k<=N; k++){
                    if(k==i || k==j) continue;
                    int ans = Math.min(graph[k][i], graph[k][j]);
                    dist += ans * 2; // 왕복거리 +2
                }

                if(dist < minDist){ // 왕복 거리 합이 더 작으면 갱신
                    minDist = dist;
                    x = i;
                    y = j;
                } else if(dist == minDist){ // 왕복 거리 합이 같을 경우 -> 첫번째 번호가 더 작을 경우 갱신
                    if(i < x || i==x && j<y){ // 첫번째 번호가 같고 두번째 번호가 더 작을 경우 갱신
                        x = i;
                        y = j;
                    }
                }
            }
        }
        System.out.println(x + " " + y + " " + minDist);
    }
    private static void floyd(int[][] graph, int n){ // 모든 정점 간 최단 거리 계산
        for(int k=1; k<=n; k++){ // 경유지
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n; j++) {
                    if (graph[i][k] != INF && graph[k][j] != INF) {
                        graph[i][j] = Math.min(graph[i][j], graph[i][k] + graph[k][j]);
                    }
                }
            }
        }
    }
}