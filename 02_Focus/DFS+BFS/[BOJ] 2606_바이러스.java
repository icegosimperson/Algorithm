// 시간 복잡도 : N <= 100, 쌍 n-1 O(N^2) 이상 가능
// 1번 컴퓨터를 통해 웜 바이러스에 걸리게 되는 컴퓨터의 수
// 사용할 자료구조 : 완전 탐색, DFS

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<Integer>[] A;
    static boolean visited[];
    static int cnt=0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int computer = Integer.parseInt(br.readLine());
        int network = Integer.parseInt(br.readLine());

        A = new ArrayList[computer + 1];
        visited = new boolean[computer + 1];
        // ArrayList 초기화
        for(int i=1; i<computer+1; i++){
            A[i] = new ArrayList<Integer>();
        }

        for(int i=0; i<network; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e);
            A[e].add(s);
        }
        Dfs(1);
        System.out.println(cnt-1);
    }
    private static void Dfs(int v){
        visited[v] = true;
        cnt++;
        for(int i : A[v]){
            if(!visited[i]){
                Dfs(i);
            }
        }
    }
}

