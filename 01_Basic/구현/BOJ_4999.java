import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BOJ_4999{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String answer = br.readLine();

        if(input.length() < answer.length()){
            System.out.println("no");
        } else{
            System.out.println("go");
        }
    }
}

/*
        String input = br.readLine();
        String answer = br.readLine();
        int aCnt = 0;
        int bCnt = 0;
        for(int i=0; i<input.length(); i++){
            aCnt+= input.charAt(i);
        }
        for(int i=0; i<answer.length(); i++){
            bCnt += answer.charAt(i);
        }

        if(aCnt <= bCnt){
            System.out.println("no");
        } else{
            System.out.println("go");
        }
 */