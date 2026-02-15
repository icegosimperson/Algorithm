import java.io.*;
import java.util.*;

public class Main{
	 
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       
        int n = Integer.parseInt(br.readLine());
        
        bw.write(String.valueOf(n+"\n"));
        bw.write("1");
        

        
        bw.flush();
        bw.close();
    }
}
