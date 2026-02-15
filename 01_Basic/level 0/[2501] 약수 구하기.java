import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken()); // 몇번째 약수?
        int q = 0;
        int count = 0;

        for(int i=1; i<=N; i++){
            if(N%i == 0){
                count++;
                if(count==K){
                    bw.write(String.valueOf(i));
                    bw.flush(); // 버퍼 비우기 (이유 : 비우지 않으면 내부적으로 데이터가 버퍼에만 저장되어 있기 때문에 출력이 안됨)
                    return; // 종료
                }
            }
        }

        bw.write(String.valueOf(0));
        bw.flush();
        br.close();
        bw.close();
    }
}
