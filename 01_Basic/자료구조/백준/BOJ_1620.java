import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<Integer, String> numberMap = new HashMap<>();
        HashMap<String, Integer> stringMap = new HashMap<>();

        for (int i = 1; i <=N; i++) {
            String input = br.readLine();
            numberMap.put(i, input);
            stringMap.put(input, i);
        }

        for (int i = 0; i < M; i++) { // key 입력 받은 경우와 Value 입력 받은 경우를 구분 해야 함!
            String input = br.readLine();
            if ('0'<input.charAt(0) && input.charAt(0) <='9') { // 숫자를 입력 받을 경우 (0 = 48, 9=57)
                int num = Integer.parseInt(input); // 숫자로 변환
                System.out.println(numberMap.get(num));
            } else{
                System.out.println(stringMap.get(input));
            }
        }
    }
}
