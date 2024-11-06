import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[3];
        for(int i=1; i<=T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken());
            int U = Integer.parseInt(st.nextToken());
            int X = Integer.parseInt(st.nextToken());
            if(X<L){
                System.out.println("#" + i + " " + (L-X));
            }
            else if(L<X && X <U){
                System.out.println("#" + i + " " +0);
            }
            else System.out.println("#" + i + " " +-1);
        }
    }
}
