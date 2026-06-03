import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 표의 크기
        int M = Integer.parseInt(st.nextToken()); // 합의 개수
        int Arr[][] = new int[N+1][N+1]; // 일반 배열

        for (int i=1; i<=N; i++){ // 일반 배열을 입력 받기
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=N; j++){
                Arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int Sum[][] = new int[N+1][N+1]; // 합 배열 선언
        for (int i=1; i<=N; i++){ // 합 배열 입력 받기
            for(int j=1; j<=N; j++){
                Sum[i][j] = Sum[i][j - 1] + Sum[i-1][j] - Sum[i - 1][j - 1] + Arr[i][j];
            }
        }

        for(int i=0; i<M; i++) { // 구간합 출력하기
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int result = Sum[x2][y2] - Sum[x1 - 1][y2] - Sum[x2][y1 - 1] + Sum[x1 - 1][y1 - 1];
            System.out.println(result);
        }
    }
}



