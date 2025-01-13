import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class BOJ_1717{
    static int[] parent;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 집합의 개수
        int m = Integer.parseInt(st.nextToken()); // 연산의 개수
        parent = new int[n+1];
        for(int i=0; i<=n; i++){ // 부모 노드 초기화
            parent[i] = i;
        }
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int input = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(input==0){
                union(a, b);// union
            } else{ //
                if(check(a, b)){
                    System.out.println("YES");
                } else{
                    System.out.println("NO");
                }
            }
        }
    }
    private static void union(int a, int b){
        // 부모 노드를 찾는다
        a = find(a);
        b = find(b);
        if(a!=b){
            parent[b] = a;
        }
    }
    private static int find(int a){
        if(a==parent[a]){ // 부모 노드일 경우
            return a;
        } else {
            return parent[a] = find(parent[a]);
        }
    }
    private static boolean check(int a, int b){
        a = find(a);
        b = find(b);
        if(a==b){
            return true;
        } return false;
    }
}