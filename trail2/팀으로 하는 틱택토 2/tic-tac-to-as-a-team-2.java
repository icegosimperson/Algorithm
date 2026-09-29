import java.util.Scanner;
public class Main {
    static int ans = 0;
    static boolean[][] visited = new boolean[10][10];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp1 = sc.next();
        String inp2 = sc.next();
        String inp3 = sc.next();
        // Please write your code here.
        int[][] board = new int[3][3];
        for(int i=0; i<3; i++){
            board[0][i] = inp1.charAt(i)-'0';
            board[1][i] = inp2.charAt(i)-'0';
            board[2][i] = inp3.charAt(i)-'0';
        }
        for(int r=0; r<3; r++){
            isValid(board[r][0], board[r][1], board[r][2]);
        }
        for(int c=0; c<3; c++){
            isValid(board[0][c], board[1][c], board[2][c]);
        }
        isValid(board[0][0], board[1][1], board[2][2]);
        isValid(board[0][2], board[1][1], board[2][0]);
        System.out.println(ans);
    }
    public static void isValid(int a, int b, int c){
        int cnt=1;
        if(a!=b) cnt++;
        if(b!=c && a!=c) cnt++;
        if(cnt==2){
            int p = Math.min(a, Math.min(b, c));
            int q = Math.max(a, Math.max(b, c));
            if(!visited[p][q]){
                visited[p][q] = true;
                ans++;
            }
        }
    }
}