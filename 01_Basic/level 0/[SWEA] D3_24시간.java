import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int t=1; t<=T; t++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            
            // 자정으로부터 A 시간 지나고, B시간 더 지난뒤 몇시?
            int num = 0;
            int result = 0;
            result = (num + A + B);
            if(result % 24 ==0)
            	result = 0;
            else
            	if(result > 24) result -= 24;	
            System.out.println("#" + t + " " + result);
        }
    }
}
