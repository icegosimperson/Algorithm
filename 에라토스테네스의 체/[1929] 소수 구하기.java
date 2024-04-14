import java.io.*;

public class Main{
    public static boolean isPrime(int x){
        if(x<2)
            return false;
        for(int i=2; i<=Math.sqrt(x); i++){
            if(x%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] input = br.readLine().split(" ");
        int M = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);
        
        for(int i=M; i<=N; i++){
            if(isPrime(i)){
                bw.write(String.valueOf(i+"\n"));
            }
        }
        bw.flush();
        bw.close();
    }
}
