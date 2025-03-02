import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BOJ_14916{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        while(n>=0){
            if(n%5==0){
                count += n / 5;
                System.out.println(count);
                return;
            }
            n-=2;
            count++;
        }
        System.out.println(-1);
    }
}