import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] white = new int[200001];
        int[] black = new int[200001];
        int[] color = new int[200001];
        int offset = 100000;
        int cur = 0; // 현재 위치
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            int next; // 다음 위치
            if(dir=='L'){ // 흰색 타일
                next = cur - x + 1;
                for(int j=next; j<=cur; j++){
                    int idx = j + offset;
                    white[idx]++;
                    if(white[idx]>=2 && black[idx]>=2){
                        color[idx] = 3; // gray
                    } else{
                        color[idx] = 1; // white
                    }
                }
            } else{ // 검은색 타일
                next = cur + x - 1;
                for(int j=cur; j<=next; j++){
                    int idx = j + offset;
                    black[idx]++;
                    if(black[idx]>=2 && white[idx]>=2){
                        color[idx] = 3; // gray
                    } else{
                        color[idx] = 2; // black
                    }
                }
            }
            cur = next;
        }
        // 흰색, 검은색, 회색 각각 타일 수 출력
        int whiteCnt = 0;
        int blackCnt = 0;
        int grayCnt = 0;
        for(int i=0; i<color.length; i++){
            if(color[i]==1){
                whiteCnt++;
            } else if(color[i]==2){
                blackCnt++;
            } else if(color[i]==3){
                grayCnt++;
            }
        }
        System.out.println(whiteCnt + " " + blackCnt + " " + grayCnt);
    }
}