import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        String N = st.nextToken(); // N
        int B = Integer.parseInt(st.nextToken()); // 진법
        int result=0;
        int tmp =1; // 해당 자리의 진법 지수 
        
        for(int i=N.length()-1; i>=0; i--) { // 가장 낮은 자리(오른쪾)부터 계산
        	char c = N.charAt(i);
        	if('A'<= c && c<='Z') { // A=65, Z=90
        		result += (c-'A'+10)*tmp; // c-'A' => 'A'~'Z' = 0~25, +10 => 10~35로 대응
        	}
        	else { // 0~9 처리 
        		result += (c-'0') * tmp; // 0~9
        	}
        	tmp *=B; // 다음 자리 수 거듭 제곱 연산이 가능하도록
        }
        
        bw.write(String.valueOf(result));
 
        bw.flush();
        bw.close();
    }
}
