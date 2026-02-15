import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        br.readLine();

        // 배열에 카드 숫자들 입력 받기
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0; // 합
        int temp =0; // 임시 저장

        // 합 계산
        for(int i=0; i<N-2; i++){
            for(int j=i+1; j<N-1; j++){
                for(int k=j+1; k<N; k++){
                    sum = arr[i] + arr[j] + arr[k];
                    if(sum > temp && sum <= M) // 현재 합(sum)이 이전의 최대 값 temp보다 크고, 주어진 값 M보다 작거나 같을 때,
                        temp = sum; // update
                }
            }
        }
        bw.write(temp + "\n");
        bw.flush();
        bw.close();
    }
}
