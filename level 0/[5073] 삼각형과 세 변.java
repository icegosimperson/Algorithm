import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a==0 && b==0 && c==0){
                break;
            }

            if (a+b<=c || b+c <= a || a+c <= b){
                bw.write("Invalid\n");
            }
            else if(a==b && b==c){
                bw.write("Equilateral\n");
            }
            else if (a==b || b==c || c==a){
                bw.write("Isosceles\n");
            }
            else {
                bw.write("Scalene\n");
            }

        }


        br.close();
        bw.flush();
        bw.close();

    }
}
