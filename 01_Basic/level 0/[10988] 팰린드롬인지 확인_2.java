import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String input = br.readLine();
        
        int result = 1;
        
        for(int i=0; i<input.length()/2; i++){
            if(input.charAt(i) != input.charAt(input.length()-1-i)){
                result=0; // 팰린드롬이 아닐 경우 result<-0
            }
        }
        bw.write(String.valueOf(result));
        
        br.close();
        bw.flush();
        bw.close();
    }
}
