import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BOJ_1543{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String input2 = br.readLine();

        input = input.replaceAll(input2, "1");
        int ans = 0;
        for(int i=0; i<input.length(); i++){
            if(input.charAt(i)=='1'){
                ans++;
            }
        }
        System.out.println(ans);
    }
}