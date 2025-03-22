import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
R  P S
가위  바위 보

 */
class BOJ_4493{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // tc
        StringTokenizer st;
        while(t-->0){
            int n = Integer.parseInt(br.readLine()); // 가위바위보 한 횟수
            int p1Cnt = 0;
            int p2Cnt = 0;
            for(int i=0; i<n; i++){
                st = new StringTokenizer(br.readLine());
                String input1 = st.nextToken();
                String input2 = st.nextToken();
                if(input1.equals(input2)) { // 무승부
                } else if(input1.equals("R")&& input2.equals("S") ||
                        input1.equals("S") && input2.equals("P") ||
                        input1.equals("P") && input2.equals("R")) {
                    p1Cnt++;
                } else {
                    p2Cnt++;
                }
            }
            if (p1Cnt > p2Cnt) {
                System.out.println("Player 1");
            } else if (p1Cnt < p2Cnt) {
                System.out.println("Player 2");
            } else {
                System.out.println("TIE");
            }
        }
    }
}


