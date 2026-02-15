import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i=1; i<=T; i++){
            br.readLine(); // 테스트 케이스 입력 무시
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] scores = new int[101]; // 점수를 배열 인덱스로
            for(int j=0; j<1000; j++){
                scores[Integer.parseInt(st.nextToken())]++;
            }
            int max = 0; // 최빈값
            int idx = 0; // 최빈값인 점수
            for(int j=100; j>0; j--){
                if(scores[j] > max){
                    max = scores[j];
                    idx = j;
                }
            }
            System.out.println("#" + i + " " + idx);
        }
    }
}
