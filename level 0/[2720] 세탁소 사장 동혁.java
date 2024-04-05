import java.util.StringTokenizer;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine()); // 테스트의 개수

        for(int i=0; i<T; i++){
            StringBuilder  sb = new StringBuilder(); // StringBuilder 초기화를 위해 반복문 안에
            int c = Integer.parseInt(br.readLine());
            sb.append(c / 25).append(" ");
            c = c % 25;

            sb.append(c / 10).append(" ");
            c %= 10;

            sb.append(c/5).append(" ");
            c %= 5;

            sb.append(c/1).append("\n");

            bw.write(sb.toString());
        }
        bw.close();
        
    }
}
