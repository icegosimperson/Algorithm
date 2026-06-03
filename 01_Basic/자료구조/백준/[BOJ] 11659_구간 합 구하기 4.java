import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)  throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()); // 첫번째 줄 입력 받음

        int N = Integer.parseInt(st.nextToken()); // 수의 개수 : N <= 100,000
        int M = Integer.parseInt(st.nextToken()); // 질의의 개수 : N <= 100,000

        long[] sumArr = new long[N + 1]; // 합의 배열 생성한 이유 : 합이 변하지 않음, 한번 합을 구해두면 계산 야러번 굳이 X (시간 제한: 0.5초)

        st = new StringTokenizer(br.readLine());// 한줄로 데이터 받아오기

        for(int i=1; i<=N; i++){
            sumArr[i] = sumArr[i-1] + Integer.parseInt(st.nextToken()); // 합 배열 공식 : S[i] = S[i-1] + A[i]
        }

        for(int k=0; k<M; k++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            System.out.println(sumArr[j] - sumArr[i-1]); // 구간합 출력
        }

    }
}

