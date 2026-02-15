import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
시간복잡도 :
브루트포스 -> 8중 for문 -> 시간 낭비
중복 없이

 */
class BOJ_15649{
    static int N, M;
    static boolean[] visited;
    static int[] arr;
    private static void dfs(int depth){
        if(depth==M){
            for(int i:arr){
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }
        for(int i=0; i<N; i++){
            if(!visited[i]){
                visited[i] = true;
                arr[depth] = i+1;
                dfs(depth+1);
                visited[i] = false;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M];
        visited = new boolean[N];
        dfs(0);
    }
}


