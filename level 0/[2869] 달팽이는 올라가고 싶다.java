import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken()); // 낮에 A미터 ++
        int B = Integer.parseInt(st.nextToken()); // 밤에 B미터 --
        int V = Integer.parseInt(st.nextToken()); // 나무 V미터

        int total_date = (V - B) / (A - B);

        if((V - B) % (A - B) != 0)
            total_date++;

        bw.write(String.valueOf(total_date));
        bw.flush();
        br.close();
        bw.close();
    }
}
