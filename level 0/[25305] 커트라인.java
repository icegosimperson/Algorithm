import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());  // 첫 줄 입력
        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken()); // 가장 높은 k명은 상을 받는다

        int[] arr = new int[N];  // Integer 배열 사용

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());  // 각 점수 입력
        }

        Arrays.sort(arr);


        bw.write(String.valueOf(arr[N-k]));  // k번째로 높은 점수 출력
        bw.newLine();  // 줄바꿈
        bw.flush();
        bw.close();
    }
}
