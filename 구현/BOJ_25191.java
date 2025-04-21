import java.io.*;
import java.util.StringTokenizer;

// 치킨 1마리를 먹을 때
// 콜라 2개 or 맥주 1개를 먹어야한다

// 임스가 시켜먹을 수 있는 치킨의 총 개수
class BOJ_25191{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N= Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken()); // 콜라의 개수
        int B = Integer.parseInt(st.nextToken()); // 맥주의 개수

        int answer = A/2 + B;
        System.out.println(Math.min(N, answer));


        bw.flush();
        bw.close();
    }
}
