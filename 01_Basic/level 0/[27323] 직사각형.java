import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // M ~ N 까지 범위
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(A*B));
        
        bw.flush();
        br.close();
        bw.close();
    }
}
