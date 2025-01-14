import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// 가중치X, 노드와 간선 크기가 큼 -> ArrayList[]
public class HW_18352 {
    static ArrayList<Integer>[] graph;
    static int[] visited;
    static int N, M, K, X;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 도시의 개수
        M = Integer.parseInt(st.nextToken()); // 도로의 개수
        K = Integer.parseInt(st.nextToken()); // 거리 정보
        X = Integer.parseInt(st.nextToken()); // 출발 도시의 번호
        graph = new ArrayList[N + 1];
        visited = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }
        Arrays.fill(visited, -1);

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            graph[s].add(e);
        }
        Bfs(X);
        boolean flag= false;
        for (int i = 0; i <= N; i++) {
            if (visited[i] == K) {
                flag = true;
                System.out.println(i);
            }
        }
        if(!flag) {
            System.out.println(-1);
        }
    }
    private static void Bfs(int start){
        Queue<Integer> queue = new LinkedList();
        queue.add(start);
        visited[start] = 0; // 시작 노드는 0으로 초기화
        while(!queue.isEmpty()){
            int cur = queue.poll();
            for(int i=0; i<graph[cur].size(); i++){
                int next = graph[cur].get(i);
                if(visited[next]==-1){
                    visited[next] = visited[cur]+1;
                    queue.add(next);
                }
            }

        }
    }
}