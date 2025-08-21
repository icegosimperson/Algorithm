import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BOJ_13752{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        while(n-->0){
            int k = Integer.parseInt(br.readLine());
            for(int i=0; i<k; i++){
                System.out.print("=");
            }
            System.out.println();
        }
    }
}