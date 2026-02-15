import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class BOJ_14924{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken()); // 기차의 속도
        int T = Integer.parseInt(st.nextToken()); // 파리의 속도
        int D = Integer.parseInt(st.nextToken()); // 처음 두 기차 사이의 거리

        int hour = D/(2*S);
        System.out.println(hour*T);
    }
}
