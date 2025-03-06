import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BOJ_11024{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-->0){
            String input = br.readLine();
            String[] numbers = input.split(" ");
            int sum = 0;
            for(String n : numbers){
                sum += Integer.parseInt(n);
            }

            System.out.println(sum);
        }
    }
}