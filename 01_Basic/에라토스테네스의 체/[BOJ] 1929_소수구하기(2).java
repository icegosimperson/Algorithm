import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] A = new int[N+1];// 1차원 배열 생성

        for(int i=2; i<=N; i++){
            A[i] = i;
        }
        // 2부터 시작하고 현재 숫자가 지워지지 않을 때는
        // 현재 선택된 숫자의 배수에 해당하는 수를 배열에서 끝까지 탐색하면서 지움
        for(int i=2; i<= Math.sqrt(N); i++){
            if(A[i] ==0) continue;
            for(int j=i+i; j<=N; j=j+i){ // 배수 지우기
                A[j] = 0;
            }
        }
        
        for(int i=M; i<=N; i++){
            if(A[i] !=0) System.out.println(A[i]);
        }
    }
}

