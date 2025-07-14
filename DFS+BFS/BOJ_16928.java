import org.w3c.dom.Node;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class BOJ_16928{
    private static int[] dist;
    private static int N, M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        Map<Integer, Integer> move = new HashMap<>(); // 도착한 칸, 이동할 칸
        dist = new int[101];
        Arrays.fill(dist, -1);
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            move.put(x, y);
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            move.put(u, v);
        }
        System.out.println(bfs(dist, move));
    }
    private static int bfs(int[] dist, Map<Integer, Integer>move){
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1); // 시작
        dist[1] = 0;
        while(!queue.isEmpty()){
            int cur = queue.poll();
            for(int i=1; i<=6; i++){
                int next = cur + i;
                if(100<next){
                    continue;
                }
                if(move.containsKey(next)){
                    next = move.get(next);
                }
                if(dist[next]==-1){
                    dist[next] = dist[cur] +1;
                    queue.add(next);
                }
            }

        }
        return dist[100];
    }
}