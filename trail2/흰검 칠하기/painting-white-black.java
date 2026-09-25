import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] white = new int[200001];
        int[] black = new int[200001];
        int[] color = new int[200001];
        int offset = 100000;
        int cur = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            int next;
            if(dir=='L'){ // 흰색
                next = cur - x + 1;
                int start = Math.min(cur, next);
                int end = Math.max(cur, next);
                for(int j=start; j<=end; j++){
                    int idx = j + offset;
                    white[idx]++;
                    if(white[idx]>=2 && black[idx]>=2){
                        color[idx] = 3;
                    } else{
                        color[idx] = 1;
                    }
                }
            } else{ // R, 블랙
                next = cur + x - 1;
                int start = Math.min(cur, next);
                int end = Math.max(cur, next);
                for(int j=start; j<=end ;j++){
                    int idx = j + offset;
                    black[idx]++;
                    if(black[idx]>=2 && white[idx]>=2){
                        color[idx] = 3;
                    } else{
                        color[idx] = 2;
                    }
                }
            }
            cur = next;
        }
        // Please write your code here.
        int whiteCnt=0;
        int blackCnt=0;
        int grayCnt=0;
        for(int i=0; i<color.length; i++){
            if(color[i]==1){
                whiteCnt++;
            } else if(color[i]==2){
                blackCnt++;
            } else if(color[i]==3){
                grayCnt++;
            }
        }
        System.out.println(whiteCnt + " "  + blackCnt + " " + grayCnt);
    }
}