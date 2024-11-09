import java.io.*;

public class Solution {
	static int[] dx = {0, 1, 0, -1};
	static int[] dy = {1, 0, -1, 0};
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for(int t=1; t<=T; t++){
			int N = Integer.parseInt(br.readLine());
			int[][] arr = new int[N][N];
			int x=0, y=0, d=0;
			int cnt=1;
			for(int i=0; i<N*N; i++) {
				arr[x][y] = cnt++; 
				int nx = x + dx[d];
				int ny = y + dy[d];
				
				if(nx<0 || ny<0 || nx>=N || ny>=N || arr[nx][ny] !=0) { // 배열 범위 벗어나면
					d = (d+1)%4; // 방향 전환
					nx = x + dx[d];
					ny = y + dy[d];
				}
				// 좌표 업데이트
				x = nx;
				y = ny;
			}
			
			System.out.printf("#%d\n", t);
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
}
