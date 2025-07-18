import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class BOJ_11725{
    private static int[] parents;
    private static List<Integer>[] tree;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine()); // 노드의 개수
        parents = new int[N + 1];
        tree = new ArrayList[N+1];
        for(int i=1; i<=N; i++){
            tree[i] = new ArrayList<>();
        }
        for(int i=0; i<N-1; i++){
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            tree[A].add(B);
            tree[B].add(A);
        }
        dfs(1, 0);
        for(int i=2; i<=N; i++) {
            System.out.println(parents[i]);
        }
    }
    private static void dfs(int cur, int parent){
        parents[cur] = parent;
        for(int next : tree[cur]){
            if(next!=parent){
                dfs(next, cur);
            }
        }
    }
}