import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        bw.write(String.valueOf((int)Math.pow(Math.pow(2, N)+1, 2))); // Math.pow() double형 반환 하기에 int 변환
        bw.flush();
        br.close();
        bw.close();
    }
}
