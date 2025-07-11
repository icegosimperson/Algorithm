import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class BOJ_16564{
    private static int N, M;
    private static int[] arr, arr2;
    private static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        arr2 = new int[M];
        visited = new boolean[N];

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
                System.out.print(arr2[i] + " ");
            }
            System.out.println();
            return;
        }
        for(int i=0; i<N; i++){
            if(visited[i]) continue;
            visited[i] = true;
            arr2[depth] = arr[i];
            dfs(depth + 1);
            visited[i] = false;
        }
    }
}