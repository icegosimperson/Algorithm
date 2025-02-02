import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class BOJ_10093{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        if(A<B){
            System.out.println(B-A-1);
            for(long i=1; i<=B-A-1; i++){
                System.out.print(A+i);
                System.out.print(" ");
            }
        } else if(B < A){ // B < A
            System.out.println(A-B-1);
            for(long i=1; i<=A-B-1; i++){
                System.out.print(B+i);
                System.out.print(" ");
            }
        } else{
            System.out.println(0);
        }

    }
}