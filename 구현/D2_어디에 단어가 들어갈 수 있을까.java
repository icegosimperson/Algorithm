import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int T = Integer.parseInt(br.readLine());
	   
	   for(int t=1; t<=T; t++) {
		  StringTokenizer st = new StringTokenizer(br.readLine());
		  int N = Integer.parseInt(st.nextToken()); // 퍼즐의 길이
		  int K = Integer.parseInt(st.nextToken()); // 단어의 길이
		  int ans=0;
		  int[][] board = new int[N][N];
		  for(int i=0; i<N; i++) {
			  st = new StringTokenizer(br.readLine());
			  for(int j=0; j<N; j++) {
				  board[i][j] = Integer.parseInt(st.nextToken());	
			  }
		  }
		  
		  // 가로 탐색
		  for(int i=0; i<N; i++) {
			  int cnt =0;
			  for(int j=0; j<N; j++) {
				  if(board[i][j]==1) { // 흰색칸 : 1
					  cnt++;
				  } 
				  else { // board[i][j]==0  검정칸 : 0
					  if(cnt==K) {
						  ans++;
					  }
					  cnt=0;
				  }
			  }
			  if(cnt==K) ans++;
		  }
		  
		  // 세로 탐색
		  for(int i=0; i<N; i++) {
			  int cnt =0;
			  for(int j=0; j<N; j++) {
				  if(board[j][i]==1) {
					  cnt++;
				  }
				  else {
					  if(cnt==K) {
						  ans++;
					  }
					  cnt=0;
				  }
			  }
			  if(cnt==K) ans++;
		  }
		  System.out.println("#" + t + " " + ans);
	   }
   }
}
