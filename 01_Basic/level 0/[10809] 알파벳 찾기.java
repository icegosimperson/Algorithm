import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
        
        String S = br.readLine();
        for (int i = 'a'; i<='z'; i++){
            bw.write(S.indexOf(i)+" ");
        }
        
        bw.flush();
        bw.close();
    }
}
