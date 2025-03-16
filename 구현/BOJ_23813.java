import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class BOJ_23813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();

        String N = br.readLine();
        long sum = 0;
        for(int i=0; i<N.length(); i++){
            sum += Long.parseLong(N);
            N = N.substring(1) + N.charAt(0); // 문자열 회전
            // substring(1) -> 첫번째 문자 제거 + charAt(0)으로 제거된 문자를 맨 뒤로 추가
        }
        System.out.println(sum);


    }
}