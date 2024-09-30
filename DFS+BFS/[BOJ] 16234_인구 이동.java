import java.io.*;
import java.util.*;

public class Main {
    static int n, L, R, answer;
    static int[][] board;  
    static boolean[][] visited;
    static int[] dr = {0, 1, 0, -1};  // 행(row) 이동: 오른쪽, 아래, 왼쪽, 위
    static int[] dc = {1, 0, -1, 0};  // 열(column) 이동: 오른쪽, 아래, 왼쪽, 위
    static ArrayList<Node> list;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); // 총 칸의 크기 
        L = Integer.parseInt(st.nextToken()); // 계란 이동의 범위의 최솟값
        R = Integer.parseInt(st.nextToken()); // 계란 이동 범위의 최댓값

        board = new int[n][n]; 

        for (int r = 0; r < n; r++) {  
            st = new StringTokenizer(br.readLine());
            for (int c = 0; c < n; c++) {  
                board[r][c] = Integer.parseInt(st.nextToken()); 
            }
        }

        System.out.println(move());
    }

    public static int move() {
        int cnt = 0;
        while (true) {
            visited = new boolean[n][n];
            boolean isMove = false;
            for (int r = 0; r < n; r++) { 
                for (int c = 0; c < n; c++) { 
                    if (!visited[r][c]) {
                        int sum = bfs(r, c);
                        if (list.size() > 1) {
                            change(sum);
                            isMove = true;
                        }
                    }
                }
            }
            if (!isMove) return cnt; 
            cnt++;
        }
    }

    public static int bfs(int r, int c) { 
        Queue<Node> queue = new LinkedList<>();
        list = new ArrayList<>();

        queue.offer(new Node(r, c));
        list.add(new Node(r, c));
        visited[r][c] = true;

        int sum = board[r][c];  
        while (!queue.isEmpty()) {
            Node current = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nr = current.r + dr[i]; 
                int nc = current.c + dc[i];  
                if (isRange(nr, nc) && !visited[nr][nc]) {
                    int diff = Math.abs(board[current.r][current.c] - board[nr][nc]);  
                    if (L <= diff && diff <= R) {
                        queue.offer(new Node(nr, nc));
                        list.add(new Node(nr, nc));
                        sum += board[nr][nc]; 
                        visited[nr][nc] = true;
                    }
                }
            }
        }
        return sum;
    }

    public static void change(int sum) {
        int avg = sum / list.size();
        for (Node n : list) {
            board[n.r][n.c] = avg; 
        }
    }

    private static boolean isRange(int r, int c) {  
        return r >= 0 && r < n && c >= 0 && c < n;  
    }

    public static class Node {
        int r, c; 
        public Node(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
}
