import java.io.*;
import java.math.BigInteger;

// A번째 탑의 가장 위에 있는 원판을
// B번째 탑의 가장 위로 올린다

// N이 20보다 큰 경우에는 과정을 출력할 필요는 없다
// f(n) = 1(가장 큰 원반이 이동하는 횟수) + 2f(n-1)

/*
n-1개의 원판을 기둥 a에서
 */
class BOJ_1914{
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine()); // 장대에 쌓인 원판의 개수
        sb.append(BigInteger.valueOf(2).pow(n).subtract(BigInteger.ONE)).append("\n"); // BigInteger 처리때문에 계속 틀렸었음
        if(n<=20){
            hanoi(n, 1, 3);
        }
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }
    private static void hanoi(int n, int start, int end) throws IOException{
        if(n==1){
            sb.append(start + " " + end).append("\n");
            return;
        }
        hanoi(n-1, start, 6-start-end);
        sb.append(start + " " + end).append("\n");
        hanoi(n-1, 6-start-end, end);
    }
}