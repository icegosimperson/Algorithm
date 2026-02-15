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
        
        for(int l=0; l<M; l++) {        	
        	st = new StringTokenizer(br.readLine());
        	int i = Integer.parseInt(st.nextToken()); 
            int j = Integer.parseInt(st.nextToken()); 
            int k = Integer.parseInt(st.nextToken());
            
            for(int a=i-1; a<j; a++) { // i-1을 해야 배열 값과 맞추는 게 가능 (배열 0부터 시작)
            	arr[a]= k;
            }
        }
        
        for(int i=0; i<arr.length; i++) {
        	 bw.write(String.valueOf(arr[i]));
        	 bw.write(" ");
        }
        br.close();
        bw.flush(); //  버퍼에 있는 모든 데이터를 출력
		bw.close(); // Buffer writer close    
    }
}
