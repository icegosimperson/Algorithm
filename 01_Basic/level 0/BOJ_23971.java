import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 강의실이 수용할 수 있는 최대 인원 수를 출력
class BOJ_23971{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken()); // 세로
        int W = Integer.parseInt(st.nextToken()); // 가로
        int N = Integer.parseInt(st.nextToken()); // 세로 N칸 이상 비우기
        int M = Integer.parseInt(st.nextToken()); // 가로 M칸 이상 비우기

        System.out.println(rows(H, N)* cols(W, M));
    }
    static int rows(int H, int N) {
        return (H + N) / (N + 1);
    }
    static int cols(int W, int M){
        return (W + M) / (M + 1);
    }
}