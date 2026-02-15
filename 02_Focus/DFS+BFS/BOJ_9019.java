import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

// A에서 B로 변환하기 위해 필요한 최소한의 명령어
class BOJ_9019{
    private static class Register{
        int n;
        String cmd;
        Register(int n, String cmd){
            this.n = n;
            this.cmd = cmd;
        }
        int D(){
            return (n*2)%10000;
        }
        int S(){
            return n == 0 ? 9999 : n - 1;
        }
        int L(){
            return n % 1000 * 10 + n / 1000; // 1234 -> 2341 -
        }
        int R(){
            return n % 10 * 1000 + n / 10; // 1234 -> 4123
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        while(T-->0){
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken()); // 레지스터 초기값
            int B = Integer.parseInt(st.nextToken()); // 최종값
            bfs(A, B);
        }
    }
    private static void bfs(int start, int target){
        boolean[] visited = new boolean[10000];
        Queue<Register> queue = new ArrayDeque<>();
        queue.add(new Register(start, ""));
        visited[start] = true;
        while(!queue.isEmpty()){
            Register cur = queue.poll();
            if(cur.n==target){
                System.out.println(cur.cmd);
                return;
            }
            int[] next = {cur.D(), cur.S(), cur.L(), cur.R()};
            char[] cmd = {'D', 'S', 'L', 'R'};
            for(int i=0; i<4; i++){
                int n = next[i];
                if(!visited[n]){
                    visited[n] = true;
                    queue.add(new Register(n, cur.cmd + cmd[i]));
                }
            }
        }
    }
}