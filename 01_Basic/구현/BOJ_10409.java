import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class BOJ_10409 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 일의 개수
        int T = Integer.parseInt(st.nextToken()); // 각 일의 수행 시간
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int sum = 0;
        int cnt = 0;
        for(int i=0; i<n; i++){
            if(sum +arr[i] >T) {
                break;
            }
            sum += arr[i];
            cnt++;
        }
        System.out.println(cnt);
    }
}