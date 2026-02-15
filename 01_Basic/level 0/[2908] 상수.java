package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Baekjoon{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String input_A = st.nextToken();
        String input_B = st.nextToken();

        String reverse1 = "";
        String reverse2 = "";

        for(int i=input_A.length()-1; i>=0; i--){
            reverse1 += input_A.charAt(i);
        }

        for(int i=input_B.length()-1; i>=0; i--){
            reverse2 += input_B.charAt(i);
        }

        int A = Integer.parseInt(reverse1);
        int B = Integer.parseInt(reverse2);

        // 대소 비교
        if(A<B)
            bw.write(String.valueOf(B));
        else
            bw.write(String.valueOf(A));


        bw.flush();
        bw.close();
    }
}
