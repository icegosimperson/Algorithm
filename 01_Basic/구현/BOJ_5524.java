import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BOJ_5524{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        while(N-->0){
            String input = br.readLine();
            System.out.println(input.toLowerCase());
        }
    }
}