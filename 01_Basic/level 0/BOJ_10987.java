import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BOJ_10987{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int cnt = 0;
        for(int i=0; i< input.length(); i++){
            if(input.charAt(i)=='a'|| input.charAt(i)=='e' || input.charAt(i)=='i' || input.charAt(i)=='o' || input.charAt(i)=='u'){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}