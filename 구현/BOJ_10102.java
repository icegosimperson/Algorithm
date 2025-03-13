import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BOJ_10102{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int V = Integer.parseInt(br.readLine()); // 심사위원 수
        String input = br.readLine();
        int aCnt = 0;
        int bCnt = 0;

        for(int i=0; i<V; i++){
            if(input.charAt(i)=='A'){
                aCnt++;
            } else{
                bCnt++;
            }
        }

        if(aCnt<bCnt){
            System.out.println('B');
        } else if(aCnt > bCnt){
            System.out.println('A');
        } else{
            System.out.println("Tie");
        }
    }
}