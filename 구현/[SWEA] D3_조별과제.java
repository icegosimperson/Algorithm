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
            int result = 0;
            if(N<3) result = 0;
            else{
                result = N/3;
            }
            System.out.printf("#%d %d\n", t, result);
        }

    }
}
