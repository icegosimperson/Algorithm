import org.w3c.dom.Node;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// M * M 크기의 파리채를 내리쳐 최대한 많은 파리를 죽이고자 한다
// M * M 합이 가장 큰 영역의 합 구하기
// BFS 문제?
class D2_2001
{
    private static int N, M;
    private static int[][] board;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        int tc = 1;
        while(T-->0){
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            board = new int[N][N];
            for(int i=0; i<N; i++){
                st = new StringTokenizer(br.readLine());
                for(int j=0; j<N; j++){
                    board[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            int max = 0;
            for(int i=0; i<=N-M; i++){
                for(int j=0; j<=N-M; j++){
                    int sum = 0;
                    for(int x=i; x<i+M; x++){
                        for(int y=j; y<j+M; y++){
                            sum += board[x][y];
                        }
                    }
                    max = Math.max(max, sum);
                }
            }
            System.out.println("#" + tc + " " + max);
            tc++;
        }
    }
}
