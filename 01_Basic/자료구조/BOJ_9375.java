import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class BOJ_9375 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        while(T-->0){
            int n = Integer.parseInt(br.readLine()); // 해빈이가 가진 의상 수
            HashMap<String, Integer> hashMap = new HashMap<>();
            for(int i=0; i<n; i++){
                st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                String type = st.nextToken();
                if(hashMap.containsKey(type)){
                    hashMap.put(type, hashMap.get(type)+1);
                } else{
                    hashMap.put(type, 1);
                }
            }
            int result = 1;
            for(int val:hashMap.values()){
                result *= (val + 1); // 아무것도 안입을 경우 +1
            }
            System.out.println(result-1); // 둘다 안입을경우 -1
        }
    }
}