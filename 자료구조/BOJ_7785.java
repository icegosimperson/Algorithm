import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class BOJ_7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        HashMap<String, Boolean> hashMap = new HashMap<>();

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());    // enter이면 Put
            String name = st.nextToken();
            String command = st.nextToken();
            if(command.equals("enter")){
                hashMap.put(name, true);
            } else if(command.equals("leave")) {
                hashMap.remove(name);
            }

            // leave이면 삭제
        }

        // HashMap은 순서 보장x 역순 정렬 기능 구현 필요
        List<String> list = new ArrayList<>(hashMap.keySet());
        list.sort(Collections.reverseOrder());
        for (String name : list) {
            System.out.println(name);
        }
    }
}

/*
hashMap.keySet() : hashMap에서 모든 키를 반환하는 메서드
 */