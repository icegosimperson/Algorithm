import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            br.close();
            if (a+b<=c){
                c = a + b -1;
            }
            else if(b+c <= a){
                a = b + c -1;
            }
            else if (a+c <= b){
                b = a + c -1;
            }
            bw.write(String.valueOf(a+b+c));


        bw.flush();
        bw.close();

    }
}
