import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class BOJ_15652{
    private static int N, M;
    private static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M];

        dfs(1, 0);
    }
    private static void dfs(int s, int depth){
        if(depth==M){
            for(int v : arr){
                System.out.print(v + " ");
            }
            System.out.println();
            return;
        }
        for(int i=s; i<=N; i++){
            arr[depth] = i;
            dfs(i, depth + 1);
        }
    }
}