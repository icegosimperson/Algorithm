import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            Stack<Character> stack = new Stack<>();
            String str = br.readLine() + '\n'; // '\n' 없으면 마지막 단어가 출력되지 않음

            for (char ch : str.toCharArray()) { // 문자열을 문자로 변환
                if (ch == ' ' || ch == '\n') {
                    while (!stack.isEmpty()) {
                        bw.write(stack.pop());
                    }
                    bw.write(ch); // 단어 구분을 위해 공백이나 개행문자 출력
                } else {
                    stack.push(ch); // 스택에 문자열 저장
                }
            }

        }

        br.close();
        bw.flush();
        bw.close();

    }
}
