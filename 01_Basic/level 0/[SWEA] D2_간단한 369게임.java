import java.util.*;
import java.io.*;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i=1; i<=N; i++){
            String input = String.valueOf(i);
            int cnt = 0;
            for(int j=0; j<input.length(); j++){
                char ch = input.charAt(j);
                if(ch =='3' || ch =='6' || ch=='9'){
                    cnt++;
                }
            }
            if(cnt>0){
                for(int j=0; j<cnt; j++){
                    System.out.print('-');
                }
            } else {
                System.out.print(input);
            }
            System.out.print(" ");
        }
	}
}
