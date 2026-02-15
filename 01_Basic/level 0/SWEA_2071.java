
import java.util.*;
import java.io.*;

class SWEA_2071
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        int cnt = 0;
        while(T-->0){
            st = new StringTokenizer(br.readLine());
            double sum = 0;
            for(int i=0; i<10; i++){
                sum  += Integer.parseInt(st.nextToken());
            }
            cnt++;
            System.out.println("#" + cnt + " "+ Math.round(sum/10));
        }
    }
}