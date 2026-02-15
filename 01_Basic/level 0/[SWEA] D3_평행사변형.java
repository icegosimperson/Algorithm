import java.io.BufferedReader;
import java.util.*;
import java.io.InputStreamReader;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=1; i<=T; i++){
            int num = Integer.parseInt(br.readLine());
            System.out.printf("#%d %d\n", i, (num*num));
        }
    }
}
