import java.io.*;
class BOJ_26645{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        if(200 <= N && N < 206){
            bw.write(String.valueOf(1));
        } else if(206 <=N && N < 218){
            bw.write(String.valueOf(2));
        } else if(218<=N && N <= 228){
            bw.write(String.valueOf(3));
        } else bw.write(String.valueOf(4));

        bw.flush();
        br.close();
    }
}