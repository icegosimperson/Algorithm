import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 모든 손님이 원하는 스시의 개수 총합 = 셰프가 만들 촙랍의 개수
// 스시 목록 길이를 단순히 더해서 풂면 되는 문제
class BOJ_20494 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // N명의 대회 운영진
        int cnt = 0;// 셰프가 만들어야하는 초밥 개수
        for(int i=0; i<N; i++){
            String input = br.readLine();
            cnt += input.length();
        }
        System.out.println(cnt);
    }
}