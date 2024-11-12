import java.io.*;
import java.util.*;

public class Solution {
   static int H, W, N;
   static char[][] board;
   static int[] dx = {-1, 1, 0, 0}; // UDLR
   static int[] dy = {0, 0, -1, 1};
   static int curX, curY, curDir;

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int T = Integer.parseInt(br.readLine());

      for (int t = 1; t <= T; t++) { 
         StringTokenizer st = new StringTokenizer(br.readLine());
         H = Integer.parseInt(st.nextToken()); // 맵의 높이
         W = Integer.parseInt(st.nextToken()); // 맵의 너비
         curX = 0; curY=0; curDir=0;
         board = new char[H][W];

         for (int i = 0; i < H; i++) {
            String line = br.readLine();
            for (int j = 0; j < W; j++) {
               board[i][j] = line.charAt(j);
               if (board[i][j] == '^') {
                  curDir = 0;
                  curX = i; curY = j;
               } else if (board[i][j] == 'v') {
                  curDir = 1;
                  curX = i; curY = j;
               } else if (board[i][j] == '<') {
                  curDir = 2;
                  curX = i; curY = j;
               } else if (board[i][j] == '>') {
                  curDir = 3;
                  curX = i; curY = j;
               }
            }
         }

         N = Integer.parseInt(br.readLine()); 
         String input = br.readLine();
        
         for (int i = 0; i < N; i++) {
            if (input.charAt(i) == 'S') {
               shoot(); // 발사
            } else {
               move(input.charAt(i)); // 이동
            }
         }

         System.out.print("#" + t + " ");
         for (int i = 0; i < H; i++) {
            System.out.println(new String(board[i]));
         }
      }
   }

   public static void shoot() {
      int nx = curX + dx[curDir];
      int ny = curY + dy[curDir];
      
      while (isValid(nx, ny)) {
         if (board[nx][ny] == '*') { // 벽돌에 맞으면
            board[nx][ny] = '.'; // 평지로 변경
            return;
         } else if (board[nx][ny] == '#') { // 강철벽에 맞으면 중단
            return;
         }
         nx += dx[curDir];
         ny += dy[curDir];
      }
   }
 
   public static void move(char c) {
      char mark = ' ';
      switch (c) {
         case 'U': 
        	 curDir = 0; 
        	 mark = '^'; 
        	 break;
         case 'D': 
        	 curDir = 1; 
        	 mark = 'v'; 
        	 break;
         case 'L': 
        	 curDir = 2; 
        	 mark = '<'; 
        	 break;
         case 'R': 
        	 curDir = 3; 
        	 mark = '>'; 
        	 break;
         default: 
        	 return;
      }
      
      int nx = dx[curDir] + curX;
      int ny = dy[curDir] + curY;

      if (isValid(nx, ny) && board[nx][ny] == '.') {
         board[curX][curY] = '.'; // 이전 위치를 평지로 변경
         curX = nx;
         curY = ny;
      }
      
      // 현재 위치에 방향 표시
      board[curX][curY] = mark;
   }

   public static boolean isValid(int nx, int ny) {
      return nx >= 0 && ny >= 0 && nx < H && ny < W;
   }
}
