import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
       String input = br.readLine();

       char[] arr1 = new char[input.length()/2];
       char[] arr2 = new char[(input.length()+1)/2];
       
       for(int i=0; i<input.length()/2; i++) {
    	   arr1[i] = input.charAt(i);
       }
       
       for (int j = input.length() - 1; j >= input.length()/2; j--) {
           arr2[j - input.length() / 2] = input.charAt(j);
       }
       
       boolean isEqual = true;
       
       for(int i=0; i<arr1.length; i++) {
    	   if(arr1[i]!=arr2[arr2.length-1-i]) {
    		   isEqual = false;
    		   break;
    	   }
       }
       if(isEqual) {
    	   bw.write("1");
       }
       else
    	   bw.write("0");
 
       br.close();
       bw.flush();
       bw.close();
       }
    
}
