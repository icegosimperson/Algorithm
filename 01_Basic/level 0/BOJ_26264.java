import java.io.*;

public class BOJ_26264{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim()); // 필요하면 검증용으로 활용 가능
        String s = br.readLine().trim();

        int i = 0, big = 0, sec = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            if (c == 'b') {         // "bigdata"
                big++;
                i += 7;
            } else {                // 's' 시작 → "security"
                sec++;
                i += 8;
            }
        }

        if (big > sec) {
            System.out.println("bigdata?");
        } else if (big < sec) {
            System.out.println("security!");
        } else {
            System.out.println("bigdata? security!");
        }
    }
}