import java.io.*;
import java.util.*;
public class Main {
    static ArrayList<Integer>[] A;
    static boolean visited[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 정점의 개수
        int M = Integer.parseInt(st.nextToken()); // 간선의 개수
        int V = Integer.parseInt(st.nextToken()); // 정점의 번호

        A = new ArrayList[N+1];

        for(int i=1; i<N+1; i++){
            A[i] = new ArrayList<Integer>();
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e);
            A[e].add(s);
        }

        for(int i=1; i<N+1; i++){
            Collections.sort(A[i]);
        }

        visited = new boolean[N+1];
        dfs(V);
        System.out.println();
        visited = new boolean[N+1];
        bfs(V);
        System.out.println();
    }
    private static void dfs(int v){
        System.out.print(v + " ");
        visited[v] = true;
        for(int i: A[v]){
            if(!visited[i]){
                dfs(i);
            }
        }
    }

    private static void bfs(int v){
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(v);
        visited[v] = true;

        while(!queue.isEmpty()){
            int now_Node = queue.poll();
            System.out.print(now_Node + " ");
            for(int i: A[now_Node]){
                if(!visited[i]){
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }

    }

}

