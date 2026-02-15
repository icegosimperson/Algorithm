import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 학생들을 모두 배정하기 위해 필요한 최소한의 방의 수
class BOJ_13300{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 수학여행에 참가하는 학생 수
        int K = Integer.parseInt(st.nextToken()); // 한 방에 배정할 수 있는 최대 인원 수
        int[][] students = new int[2][7];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken()); // 성별 (여학생 0, 남학생 1)
            int Y = Integer.parseInt(st.nextToken()); // 학년
            students[S][Y]++;
        }
        int ans = 0;
        for(int i=0; i<2; i++){
            for(int j=0; j<7; j++){
                if(students[i][j]>0){
                    ans += (students[i][j] + K - 1)/K;
                }
            }
        }
        System.out.println(ans);
    }
}