import java.io.*;
import java.util.StringTokenizer;

class BOJ_1312{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int result = 0;
        for(int i=0; i<N; i++){
            A = (A%B) * 10; // 나머지 구하고, 10 곱해서 소수 자리로 이동
            result= A/B; // 자리수 구하기
        }
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
