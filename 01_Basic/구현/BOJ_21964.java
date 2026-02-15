import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 마지막 5글자만 출력하는 프로그램
class BOJ_21964{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 문자열의 길이 N
        String input = br.readLine(); // N글자로 이루어진 문자열 S 주어짐
        System.out.println(input.substring(N-5, N));

    }
}