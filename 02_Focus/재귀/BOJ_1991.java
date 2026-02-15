import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class BOJ_1991{
    private static char[][] tree = new char[26][2]; // 왼쪽 자식, 오른쪽 자식
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine()); // 노드의 개수

        while(N-->0){
            st = new StringTokenizer(br.readLine());
            char A = st.nextToken().charAt(0);
            char B = st.nextToken().charAt(0);
            char C = st.nextToken().charAt(0);

            tree[A-'A'][0]=B;
            tree[A-'A'][1]=C;
        }
        preorder('A');
        System.out.println();
        inorder('A');
        System.out.println();
        postorder('A');
    }
    private static void preorder(char node){
        if(node=='.'){
            return;
        }
        System.out.print(node);
        preorder(tree[node-'A'][0]); // 왼쪽 자식 방문
        preorder(tree[node-'A'][1]); // 오른쪽 자식 방문
    }
    private static void inorder(char node){
        if(node=='.'){
            return;
        }
        inorder(tree[node-'A'][0]);
        System.out.print(node);
        inorder(tree[node-'A'][1]);
    }
    private static void postorder(char node){
        if(node=='.'){
            return;
        }
        postorder(tree[node-'A'][0]);
        postorder(tree[node-'A'][1]);
        System.out.print(node);
    }
}