import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class BOJ_11170{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        while(T-->0){
            st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken()); // N~M까지 수들 중에 0의 개수
            int M = Integer.parseInt(st.nextToken());

            int cnt = 0; // 0의 개수를 카운트하는 개수
            for(int i=N; i<=M; i++){
                if(i==0) cnt++;
                int temp = i;
                while(temp>0){
                    if(temp%10==0){
                        cnt++;
                    }
                    temp /= 10;
                }
            }
            System.out.println(cnt);
        }



    }
}