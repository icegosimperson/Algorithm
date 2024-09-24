import java.util.*;
import java.io.*;

public class Main {    
    static ArrayList<Integer>[] A;
    static boolean visited[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        A = new ArrayList[N+1];
        visited = new boolean[N+1];
        
        for(int i=1; i<N+1; i++){
            A[i] = new ArrayList<Integer>();
        }
        

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            A[u].add(v);
            A[v].add(u);
        }
        
        int count =0;
        // 탐색 반복문
        for(int i=1; i<N+1; i++){
            if(visited[i] == false){
                count++;
                dfs(i);
            }    
        }
        System.out.println(count);
    }
    static void dfs(int v){
        if(visited[v]){
            return;
        }
        visited[v] = true;// 방문을 안했다면
        for(int i : A[v]){
            if(visited[i]==false){
                dfs(i);
            }
        }
    }
}
