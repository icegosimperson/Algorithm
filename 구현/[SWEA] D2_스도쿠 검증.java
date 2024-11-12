import java.io.*;
import java.util.*;

public class Solution {
    static int[][] board;
    static int answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            board = new int[9][9];
            for (int i = 0; i < 9; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 9; j++) {
                    board[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            answer = 1;  
            for (int i = 0; i < 9; i++) {  // 행과 열
                if (!checkRow(i) || !checkCol(i)) { 
                    answer = 0;
                    break;
                }
            }

            if (answer == 1) {
                for (int i = 0; i <= 6; i += 3) { // 3x3
                    for (int j = 0; j <= 6; j += 3) {
                        if (!checkSquare(i, j)) {
                            answer = 0;
                            break;
                        }
                    }
                    if (answer == 0) break;
                }
            }

            System.out.println("#" + t + " " + answer);
        }
    }

    static boolean checkRow(int r) {
        boolean[] visited = new boolean[10];
        for (int i = 0; i < 9; i++) {
            int n = board[r][i];
            if (visited[n])
                return false;
            visited[n] = true;
        }
        return true;
    }

    static boolean checkCol(int c) {
        boolean[] visited = new boolean[10];
        for (int i = 0; i < 9; i++) {
            int n = board[i][c];
            if (visited[n])
                return false;
            visited[n] = true;
        }
        return true;
    }

    static boolean checkSquare(int x, int y) {
        boolean[] visited = new boolean[10];
        for (int i = x; i < x + 3; i++) {
            for (int j = y; j < y + 3; j++) {
                int n = board[i][j];
                if (visited[n])
                    return false;
                visited[n] = true;
            }
        }
        return true;
    }
}



