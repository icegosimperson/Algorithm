import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int[] input = new int[N];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<N; i++){
            input[i] = Integer.parseInt(st.nextToken());
            map.put(input[i], 0);
        }

        List<Integer> key = new ArrayList<>(map.keySet()); // 인덱스 매핑을 위함
        Collections.sort(key);
        int idx = 0;
        for(int i=0; i<key.size(); i++){
            map.put(key.get(i), idx++); // 정렬된 값에 인덱스 부여
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            sb.append(map.get(input[i])).append(" ");
        }
        System.out.println(sb.toString());

    }
}
