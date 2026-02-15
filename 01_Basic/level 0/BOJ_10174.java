
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BOJ_10174{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        while(N-->0){
            String input = br.readLine();
            String lower = input.toLowerCase();
            String reverse = new StringBuilder(lower).reverse().toString();

            if(lower.equals(reverse)){
                System.out.println("Yes");
            } else{
                System.out.println("No");
            }
        }

    }
