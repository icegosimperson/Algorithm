import java.io.*;
import java.math.BigInteger;


class BOJ_1373{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        BigInteger N = new BigInteger(input, 2); // 10진수로 바꿔줌
        String answer = N.toString(8);
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}
