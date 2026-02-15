import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// Site 중복X -> HashMap
public class BOJ_17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());// 저장된 사이트 주소의 수
        int M = Integer.parseInt(st.nextToken()); // 비밀 번호를 찾으려는 사이트의 주소

        HashMap<String, String> hashMap = new HashMap<>();

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            String site = st.nextToken();
            String pwd = st.nextToken();
            hashMap.put(site, pwd);
        }

        for(int i=0; i<M; i++){
            String pwd = br.readLine();
            System.out.println(hashMap.get(pwd));// 출력 하는 식으로

        }


    }
}