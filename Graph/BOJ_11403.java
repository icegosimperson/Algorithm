import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class BOJ_11403{
    private static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());

        int[][] graph = new int[N][N];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        floyd(graph);
    }
    private static void floyd(int[][] graph){
        for(int k=0; k<N; k++){
            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    if(graph[i][k] ==1 && graph[k][j] ==1){
                        graph[i][j] = 1;
                    }
                }
            }
        }
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }
}