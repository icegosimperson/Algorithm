import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;


class BOJ_2083{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int age = Integer.parseInt(st.nextToken());
            int kg = Integer.parseInt(st.nextToken());
            if(name.equals("#") && age==0 && kg==0){ // 종료 조건
                break;
            }
            if(age>17 || kg>=80){
                System.out.println(name + " Senior");
            } else{
                System.out.println(name + " Junior");
            }
        }

//        bw.flush();
//        bw.close();
    }
}
