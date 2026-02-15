import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        String input = br.readLine();
        long sum = 0;
        long pow = 1;

        for(int i=0; i<L; i++){
            sum += ((input.charAt(i)-96) * pow);// 아스키 코드로 변환 a~z ( 1~ 26)
            pow = (pow * 31) % 1234567891; // mod 연산
        }
        System.out.println(sum%1234567891); // mod 연산 추가해줘야함
        // sum += 26 * 31^(아스키코드)
    }
}