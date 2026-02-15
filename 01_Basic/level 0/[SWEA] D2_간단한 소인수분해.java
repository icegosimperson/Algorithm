import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 시간 복잡도 : O(N) 이하 가능
class Solution
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] numbers = {2, 3, 5, 7, 11};

        for(int i=1; i<=N; i++){
            int num = Integer.parseInt(br.readLine());
            int[] counts = new int[5];
                for(int j=0; j<numbers.length; j++){
                    while(num % numbers[j] == 0) {
                        num /= numbers[j];
                        counts[j]++;
                    }
                }
                System.out.print("#"+i);
                for(int k=0; k<counts.length; k++){
                    System.out.print(" " + counts[k]);
                }
                System.out.println();
            }
        }
    }
