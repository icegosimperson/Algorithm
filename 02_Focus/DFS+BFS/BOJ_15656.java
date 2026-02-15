import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class BOJ_15656{
    private static int N, M;
    private static boolean[] check;
    private static int[] arr, tmp;
    private static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        check = new boolean[N];
        arr = new int[N];
        tmp = new int[N];
        sb = new StringBuilder();
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        dfs(0);
        System.out.println(sb);
    }
    private static void dfs(int depth){
        if(depth==M){
            for(int i=0; i<M; i++){
                sb.append(tmp[i] + " ");
            }
            sb.append("\n");
            return;
        }
        for(int i=0; i<N; i++){
            tmp[depth] = arr[i];
            dfs(depth + 1);
        }
    }
}