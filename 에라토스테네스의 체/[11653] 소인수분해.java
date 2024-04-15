import java.io.*;
import java.util.StringTokenizer;


public class Main{
	 
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        
        for(int i=2; i<=Math.sqrt(N); i++){
            while(N % i == 0) {
            	sb.append(i).append("\n");
                N /= i;
             }        
        }
        
        if(N!=1) {
        	sb.append(N);
        }
        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }
}
