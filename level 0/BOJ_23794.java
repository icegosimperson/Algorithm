import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class BOJ_23794{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N+2; i++){
            System.out.print("@");
        }
        System.out.println();

        for(int i=0; i<N; i++){
            System.out.print("@");
            for(int j=0; j<N; j++){
                System.out.print(" ");
            }
            System.out.print("@");
            System.out.println();
        }

        for(int i=0; i<N+2; i++){
            System.out.print("@");
        }
        System.out.println();
    }
}