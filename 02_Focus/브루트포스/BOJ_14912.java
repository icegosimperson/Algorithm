import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

class BOJ_14912{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int cnt = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int i=1; i<=n; i++){
            String input = String.valueOf(i);
            for(int j=0; j<input.length(); j++){
                char c = input.charAt(j);
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }
        char c = Character.forDigit(d, 10);
        System.out.println(map.getOrDefault(c, 0) + "");
    }
}