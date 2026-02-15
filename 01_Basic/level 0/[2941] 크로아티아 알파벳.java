import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
       String input = br.readLine();
       
       int count = 0; 
       
       for(int i=0; i<input.length(); i++) {
    	   char ch = input.charAt(i);
    	   
    	   if(ch =='c') {
    		   if(i<input.length()-1) {
    			   if(input.charAt(i+1)=='-') {
    				   i++;
    			   }
    			   else if(input.charAt(i+1)=='=')
    				   i++;
    		   }
    	   }
    	   
    	   if(ch =='d') {
    		   if(i<input.length()-1) {
    			   if(input.charAt(i+1)=='z') {
    				   if(i<input.length()-2) {
    					   if(input.charAt(i+2)=='=') { // dz=
    						   i = i+2;
    					   }
    				   }
    			   }
    			   else if(input.charAt(i+1)=='-') // d-
    				   i++;
    		   }
    	   }
    	   
    	   if(ch =='l') {
    		   if(i<input.length()-1) {
    			   if(input.charAt(i+1)=='j') { // lj
    				   i++;
    			   }
    		   }
    	   }
    	   
    	   if(ch =='n') {
    		   if(i<input.length()-1) {
    			   if(input.charAt(i+1)=='j') { // nj
    				   i++;
    			   }
    		   }
    	   }
    	   
    	   if(ch =='s') {
    		   if(i<input.length()-1) {
    			   if(input.charAt(i+1)=='=') { // s=
    				   i++;
    			   }
    		   }
    	   }
    	   
    	   if(ch =='z') {
    		   if(i<input.length()-1) {
    			   if(input.charAt(i+1)=='=') { // z=
    				   i++;
    			   }
    		   }
    	   }
    	   
    	   count++; // else
       }
    
       bw.write(String.valueOf(count));
          
       br.close();
       bw.flush();
       bw.close();
       }
    
}
