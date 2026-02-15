import java.io.*;
import java.util.*;

public class Solution {
	static char[][] board;
	static int N;
	static int[] dx = {1, 0, -1, 0, 1, -1, -1, 1};
	static int[] dy = {0, 1, 0, -1, 1, 1, -1, -1};
	static boolean flag;
	public static void main(String[] args) throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int T = Integer.parseInt(br.readLine());
	   
	   for(int t=1; t<=T; t++) {
		  N = Integer.parseInt(br.readLine());
		  board = new char[N][N];
		  for(int i=0; i<N; i++) {
			  String input = br.readLine();
			  for(int j=0; j<N; j++) {
				  board[i][j] = input.charAt(j);
			  }
		  }
		  
		  flag = false;
		  for(int i=0; i<N; i++) {
			  for(int j=0; j<N; j++) {
				  if(board[i][j]=='o') {
					  for(int d=0; d<8; d++) {
						  if(dfs(i, j, 1, d)) {
							  flag = true;
							  break;
						  }
					  }
				  }
				  if(flag) break;
			  }
			  if(flag) break;
		  }
		  System.out.println("#" + t + " " + (flag ? "YES" : "NO")); // 수정 필요
	   }
   }
	
	public static boolean dfs(int x, int y, int cnt, int dir) {
		if(cnt>=5) { 
			return true;
		}
		// 8방향 탐색 시작
		int nx = x + dx[dir]; // *k 곱하기 왜하는지 도저히 모르겠습니다
		int ny = y + dy[dir];
		
		if(isValid(nx, ny) && board[nx][ny] =='o') {
			return dfs(nx, ny, cnt+1, dir); // dfs
		}
		return false;
	}
	
	public static boolean isValid(int nx, int ny) {
		return nx>=0 && ny>=0 && nx<N && ny<N;
	}
}
