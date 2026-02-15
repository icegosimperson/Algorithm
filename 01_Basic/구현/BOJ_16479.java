import java.io.*;
import java.util.StringTokenizer;

// 등변사다리꼴 넓이 : (윗변 + 아랫변 ) * (높이)^2
class BOJ_16479{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int K = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int D1 = Integer.parseInt(st.nextToken());
        int D2 = Integer.parseInt(st.nextToken());

        double diff = (D1 - D2)/ 2.0;
        double ans = K*K - diff*diff;
        System.out.printf("%.6f\n", ans);
    }
}