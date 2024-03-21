import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
       int input = Integer.parseInt(br.readLine());
     
       for(int i=0; i<input; i++) {
    	   for(int j=1; j<input-i; j++) {
    	   	   bw.write(" ");
    	   }
    	   for(int k=0; k<2*i+1; k++) {
    		   bw.write("*");
    	   }
    	   bw.write("\n");
       }
       
       for(int i=input-1; i>0; i--) {
    	   for(int j=input-i; j>0; j--) {
    		   bw.write(" ");
    	   }
    	   for(int k=2*i-1; k>0; k--) {
    		   bw.write("*");
    	   }
    	   bw.write("\n");
       }
       
      
       br.close();
       bw.flush();
       bw.close();
       }
    
}
