import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BOJ_1550{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int ans = 0;
        int power = 1;
        for(int i=input.length()-1; i>=0; i--){
            char c = input.charAt(i);
            int temp = 0;
            if('0'<=c && c<='9'){
                temp = c - '0'; // 0~9
            } else if('A'<=c && c<='F'){
                temp = c - 'A' + 10;
            }
            ans += temp * power;
            power *= 16;
        }
        System.out.println(ans);
    }
}