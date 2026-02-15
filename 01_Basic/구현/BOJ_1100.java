import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 홀수줄, 홀수칸 -> F있는지 검사
// 짝수줄 -> 짝수칸에 F
class BOJ_1100{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] arr = new char[8][8];

        for(int i=0; i<8; i++){
            String input = br.readLine();
            arr[i]= input.toCharArray();
        }

        int cnt = 0;
        for(int i=0; i<8; i+=2){ // 1, 3, 5, 7
            for(int j=0; j<8; j+=2){
                if(arr[i][j]=='F'){
                    cnt++;
                }
            }
        }

        for(int i=1; i<8; i+=2){ //  2 4 6 8
            for(int j=1; j<8; j+=2){
                if(arr[i][j]=='F'){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}