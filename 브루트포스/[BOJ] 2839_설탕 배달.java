import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        // 상근이가 배달하는 봉지의 최소 개수를 출력
        if (N ==4  || N == 7 ){
            bw.write("-1");
        }
        else if (N % 5 ==0){
            bw.write(String.valueOf(N/5));
        }
        else if (N % 5 ==1 || N % 5 == 3){
            bw.write(String.valueOf((N/5)+1));
        }
        else if (N % 5 == 2 || N % 5 == 4){
            bw.write(String.valueOf((N/5)+2));
        }


        bw.flush();
        br.close();
        bw.close();
    }
}


