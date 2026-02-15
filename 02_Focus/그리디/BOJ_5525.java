import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BOJ_5525{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // O의 개수
        int M = Integer.parseInt(br.readLine());
        char[] s = br.readLine().toCharArray();

        int cnt = 0;
        int ans = 0;
        for(int i=1; i<M-1; i++){
            if(s[i-1]=='I' && s[i]=='O' && s[i+1]=='I'){
                cnt++;
                if(cnt==N){
                    cnt--; // 겹치는 경우 방지
                    ans++;
                }
                i++;
            } else{
                cnt = 0;
            }
        }
        System.out.println(ans);
    }
}