import java.io.*;
import java.util.StringTokenizer;

public class Main {
     public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] Arr = new int[N];

        for(int i=0; i<N; i++){
            Arr[i] = Integer.parseInt(br.readLine());
        }

         int cnt = 0;
         for (int i = N - 1; i >= 0; i--) {
             if (Arr[i] <= K) {
                 cnt += K / Arr[i];
                 K = K % Arr[i];
             }
         }
        System.out.println(cnt);
    }
}

