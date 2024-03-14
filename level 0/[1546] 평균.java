import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        Integer[] arr = new Integer[N]; // 배열 할당 
        int M = 0; // 최대값 변수
   
        StringTokenizer st = new StringTokenizer(br.readLine()); // N 선언 후 st 선언해야 함
        // 배열 값 입력 받기 
        for(int i=0; i<N; i++){
   
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
       Arrays.sort(arr, Collections.reverseOrder()); // 내림차순으로 정렬해서 배열 첫번째 값이 M으로
       M = arr[0];
       
       double average = 0;
       for(int j=0; j<arr.length; j++) {
       	average += ((double)arr[j]/M*100); // double을 반드시 붙여야 소수점 이하 값 보호
       }
       average /= N;

       bw.write(String.format("%f", average));

       br.close();
       bw.flush();
       bw.close();
       }
    
}
