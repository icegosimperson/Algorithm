import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] color = new int[200001];
        int n = sc.nextInt();
        int cur = 0;
        int offset = 100000;
        // [k, k+1]
        // 4 R => [4] 4개 (black)
        // -1, 0, 1, 2, 3, 4
        // 5 L => [-1까지 w
        // -1, 0, 1, 2, 3, 4, 5
            // -1 ~ 6까지 R
        // 2 3 4 5 화이트
        // -1, 0, 1는 블랙
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);
            int next;
            if(d=='L'){ // 왼쪽, 흰색(1)
                next = cur - x + 1;
                int start = Math.min(cur, next);
                int end = Math.max(cur, next);
                for(int j=start; j<=end; j++){
                    color[j+offset] = 1;
                }
            } else{ // 오른쪽, 검은색(2)
                next = cur + x -1;
                int start = Math.min(cur, next);
                int end = Math.max(cur, next);
                for(int j=start; j<=end; j++){
                    color[j+offset] = 2;
                }
            }
            cur = next;
        }
        // Please write your code here.
        int whiteCnt = 0;
        int blackCnt = 0;
        for(int i=0; i<color.length; i++){
            if(color[i]==1){
                whiteCnt++;
            } else if(color[i]==2){
                blackCnt++;
            }
        }
        System.out.println(whiteCnt + " " + blackCnt);
    }
}