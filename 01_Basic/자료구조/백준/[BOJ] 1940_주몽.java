import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // M <= 10,000,000

        int N = Integer.parseInt(br.readLine()); // 재료의 개수 : N <=15,000
        int M = Integer.parseInt(br.readLine()); // 갑옷을 만드는데 필요한 수 M <= 10,000,000
        int[] A = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);

        int count = 0;
        int start_index = 0; // Min
        int end_index = N-1; // Max

        while(start_index < end_index){
            if(A[start_index] + A[end_index] < M){
                start_index++;
            }
            else if(A[start_index] + A[end_index] > M){
                end_index--;
            }
            else{
                count++;
                start_index++;
                end_index--;
            }
        }
        System.out.println(count);
    }
}

