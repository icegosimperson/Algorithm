import java.io.*;
import java.util.*;

public class BOJ_4597 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while (!(line = br.readLine()).equals("#")) {
            char parity = line.charAt(line.length() - 1); // 마지막 글자 e or o
            String bits = line.substring(0, line.length() - 1); // 실제 비트 부분

            int count = 0;
            for (char c : bits.toCharArray()) {
                if (c == '1') count++;
            }

            char lastBit;
            if (parity == 'e') {
                // 짝수 패리티
                lastBit = (count % 2 == 0) ? '0' : '1';
            } else {
                // 홀수 패리티
                lastBit = (count % 2 == 0) ? '1' : '0';
            }

            System.out.println(bits + lastBit);
        }
    }
}