
import java.io.BufferedReader;
import java.util.*;
import java.io.InputStreamReader;


class Solution
{
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int t=1; t<=T; t++){
            int N = Integer.parseInt(br.readLine());
            String[] input = new String[N];  // String 배열로 입력 받아야하는가?
            for(int i=0; i<input.length; i++){
                input[i] = br.readLine();
            }

            Arrays.sort(input);

            int cnt =0;
            int check = 65; // A(65)
            for(int i=0; i<input.length; i++){
                if((int)input[i].charAt(0) == check){ // 첫글자만 확인하면됨
                    cnt++;
                    check++;
                }
            }
            System.out.println("#" + t + " " + cnt);
        }
    }
}
