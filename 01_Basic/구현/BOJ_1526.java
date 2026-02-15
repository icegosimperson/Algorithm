import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BOJ_1526{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=N; i>=4; i--){
            if (isValid(i)) {
                System.out.println(i);
                return;
            }
        }
    }
    private static boolean isValid(int n){
        while(n>0){
            int d = n%10;
            if(d !=4 && d!=7){
                return false;
            } n/=10;
        }
        return true;
    }
}