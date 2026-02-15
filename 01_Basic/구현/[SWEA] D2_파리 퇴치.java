import java.io.*;
import java.util.*;

public class Solution {
    static int[][] board;
    static int N, M, sum, max;
	public static void main(String[] args) throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int T = Integer.parseInt(br.readLine());
	   
	   for(int t=1; t<=T; t++) {
		   StringTokenizer st = new StringTokenizer(br.readLine());
		   N = Integer.parseInt(st.nextToken());
		   M = Integer.parseInt(st.nextToken());
		   board = new int[N][N];
		   for(int i=0; i<N; i++) {
			   st = new StringTokenizer(br.readLine());
			   for(int j=0; j<N; j++) {
				   board[i][j] = Integer.parseInt(st.nextToken());
			   }
		   }
		   int max = 0;
		   for(int i=0; i<=N-M; i++) {
			   for(int j=0; j<=N-M; j++) {
				   int sum = 0;
				   for(int x=0; x<M; x++) {
					   for(int y=0; y<M; y++) {
						   sum += board[i+x][j+y];
					   }
				   }
				   max = Math.max(sum, max);
			   }
		   }
		   System.out.println("#" + t + " " + max);
	   }
   }
}
