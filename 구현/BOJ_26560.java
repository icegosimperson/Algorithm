import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BOJ_26560{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        while(N-->0){
            String input = br.readLine();
            if(input.charAt(input.length()-1) !='.'){
                System.out.println(input + ".");
            } else {
                System.out.println(input);
            }

        }
    }
}