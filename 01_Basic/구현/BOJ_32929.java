import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BOJ_32929{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());

        if(x%3==0){
            System.out.println("S");
        } else if(x%3==1){
            System.out.println("U");
        } else{
            System.out.println("O");
        }
    }
}
