import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if (A==0 && B ==0) // 종료 조건 : 0 0 입력
                break;

            if(B % A == 0) // 약수 관계라면
                bw.write("factor\n");

            else if(A % B==0) // 배수 관계라면
                bw.write("multiple\n");

            else
                bw.write("neither\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
