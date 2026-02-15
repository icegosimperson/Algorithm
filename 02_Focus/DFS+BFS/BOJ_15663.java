import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class BOJ_15663{
    private static int N, M;
    private static int[] arr;
    private static int[] temp;
    private static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        visited = new boolean[N];
        temp = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        dfs(0);
    }
    private static void dfs(int depth){
        if(depth==M){
            for(int i=0; i<M; i++){
                System.out.print(temp[i] + " ");
            }
            System.out.println();
        }
        else{
            int bf = 0;
            for(int i=0; i<N; i++){
                if(visited[i]){
                    continue;
                }
                if(bf !=arr[i]){
                    visited[i] = true;
                    temp[depth] = arr[i];
                    bf = arr[i];
                    dfs(depth + 1);
                    visited[i] = false;
                }
            }
        }
    }
}