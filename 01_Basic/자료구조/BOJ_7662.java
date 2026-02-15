import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class BOJ_7662{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while(T-->0){
            int k = Integer.parseInt(br.readLine()); // 적용할 연산의 개수
            TreeMap<Integer, Integer> map = new TreeMap<>();
            for(int i=0; i<k; i++) {
                st = new StringTokenizer(br.readLine());
                String cmd = st.nextToken();
                int value = Integer.parseInt(st.nextToken());

                if(cmd.equals("I")){
                    map.put(value, map.getOrDefault(value,  0) + 1);
                } else { // "D"
                    if(map.isEmpty()){
                        continue;
                    }
                    int target = (value == 1) ? map.lastKey() : map.firstKey();
                    if(map.get(target)==1){
                        map.remove(target);
                    } else{
                        map.put(target, map.get(target) - 1);
                    }
                }
            }
            if(map.isEmpty()){
                sb.append("EMPTY").append("\n");
            } else{
                sb.append(map.lastKey()).append(" ").append(map.firstKey()).append("\n");
            }
        }
        System.out.println(sb);
    }
}