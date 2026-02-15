import java.io.BufferedReader;
import java.util.*;
import java.io.InputStreamReader;
// import java.uti.Base64;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i=1; i<=T; i++){
            String input = br.readLine();
            String result = new String(Base64.getDecoder().decode(input));
            System.out.printf("#%d %s\n", i, result);
        }
    }
}

/*
class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int tc = 1; tc <= T; tc++)
        {
            String line = sc.next();
            String result = new String(Base64.getDecoder().decode(line));
            System.out.printf("#%d %s\n",tc,result);
        }
    }
}
 */
