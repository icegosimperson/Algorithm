import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[N];
        
        // 배열 초기값 설정 (바구니 번호 == 배열 초기값)
        for(int i=0; i<N; i++){
            arr[i] = i+1; // 1~N
        }
        
        for(int l=1; l<=M; l++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            
            int temp = 0;
            temp = arr[i-1];
            arr[i-1] = arr[j-1];
            arr[j-1] = temp;
        }
        
        for(int i=0; i<arr.length; i++){
                bw.write(String.valueOf(arr[i]));
                bw.write(" ");
         }
         br.close();
         bw.flush();
         bw.close();
        }
    
}
