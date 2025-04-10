import java.io.*;
import java.util.*;

class BOJ_21736{
    static int N, M;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static char[][] arr;
    static boolean[][] visited;
    static int cnt = 0; // 도연이가 만날 수 있는 사람의 수
    static Node pos;
    static class Node{
        int x, y;
        Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new char[N][M];
        visited = new boolean[N][M];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for(int j=0; j<M; j++){
                arr[i][j] = line.charAt(j);
                if(arr[i][j]=='I'){ // 도연이의 위치 저장
                    pos = new Node(i, j);
                }
            }
        }
        bfs(pos.x, pos.y);
        if(cnt>0){
            bw.write(String.valueOf(cnt));
        } else {
            bw.write("TT");
        }
        bw.flush();
        bw.close();
    }
    private static void bfs(int s, int e){
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(s, e));
        visited[s][e] = true;
        while(!queue.isEmpty()){
            Node cur = queue.poll();
            for(int k=0; k<4; k++){
                int nx = cur.x + dx[k];
                int ny = cur.y + dy[k];
                if(isValid(nx, ny)){
                    if(arr[nx][ny]!='X' && !visited[nx][ny]){
                        visited[nx][ny] = true;
                        queue.add(new Node(nx, ny));
                        if(arr[nx][ny]=='P') cnt++;
                    }
                }
            }
        }
    }
    private static boolean isValid(int nx, int ny){
        return 0<= nx && nx<N && 0<= ny && ny <M;
    }
}