import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

class BOJ_30804{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Map<Integer, Integer> map = new HashMap<>(); // 과일 종류별 개수
        int left = 0;
        int ans = 0;

        for(int right=0; right<N; right++){
            map.put(arr[right], map.getOrDefault(arr[right], 0) +1);
            while(2 <map.size()){ // 3종류 이상일 경우
                map.put(arr[left], map.get(arr[left]) - 1); // 왼쪽부터 줄여나감
                if(map.get(arr[left])==0){ // 개수 0되면 과일 제거
                    map.remove(arr[left]);
                }
                left++;
            }
            ans = Math.max(ans, right-left+1);
        }
        System.out.println(ans);

    }
}