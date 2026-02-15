import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BOJ_2037 {
    static class Info {
        int key;     // 키 번호 (1~9)
        int presses; // 눌러야 하는 횟수
        Info(int key, int presses) {
            this.key = key;
            this.presses = presses;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] pw = br.readLine().trim().split("\\s+");
        int p = Integer.parseInt(pw[0]); // 한 번 누르는 데 걸리는 시간
        int w = Integer.parseInt(pw[1]); // 같은 키 연속 입력 대기 시간

        String s = br.readLine(); // 대문자 + 공백

        // 문자 -> (키, 누름횟수) 매핑
        Map<Character, Info> map = new HashMap<>();
        putGroup(map, " ", 1);         // 공백은 1키 1번
        putGroup(map, "ABC", 2);
        putGroup(map, "DEF", 3);
        putGroup(map, "GHI", 4);
        putGroup(map, "JKL", 5);
        putGroup(map, "MNO", 6);
        putGroup(map, "PQRS", 7);
        putGroup(map, "TUV", 8);
        putGroup(map, "WXYZ", 9);

        long total = 0;
        int prevKey = -1;
        char prevCh = '\0';

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            Info info = map.get(ch);

            // 1) 누르는 시간
            total += (long) info.presses * p;

            // 2) 같은 키 연속이면 대기 시간 (단, 공백-공백은 예외)
            if (i > 0) {
                if (info.key == prevKey && !(prevCh == ' ' && ch == ' ')) {
                    total += w;
                }
            }

            prevKey = info.key;
            prevCh = ch;
        }

        System.out.println(total);
    }

    private static void putGroup(Map<Character, Info> map, String group, int key) {
        if (group.equals(" ")) { // 공백
            map.put(' ', new Info(1, 1));
            return;
        }
        for (int i = 0; i < group.length(); i++) {
            char c = group.charAt(i);
            map.put(c, new Info(key, i + 1));
        }
    }
}