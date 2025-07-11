import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class BOJ_15651{
    static int N, M;
    static int[] arr = new int[9];
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        dfs(0);
        System.out.println(sb);
    }
    private static void dfs(int depth){
        if(depth==M){
            for(int i=0; i<M; i++){
                sb.append(arr[i] + " ");
            }
            sb.append("\n");
            return;
        }
        for(int i=1; i<=N; i++){
            arr[depth] = i;
            dfs(depth + 1);
        }
    }
}