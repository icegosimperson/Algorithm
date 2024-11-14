import java.io.*;
import java.util.*;

// 시간복잡도 : N<= 1,000,000 -> O(N^2) X
public class Solution {
	public static void main(String[] args) throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int T = Integer.parseInt(br.readLine());
	   
	   for(int t=1; t<=T; t++) {
		  int N = Integer.parseInt(br.readLine());
		  int[] arr = new int[N+1];
		  
		  StringTokenizer st = new StringTokenizer(br.readLine());
		  for(int i=1; i<=N; i++) {
			  arr[i] = Integer.parseInt(st.nextToken());
		  }
		  
		  long max = 0;
		  long ans = 0;
		  for(int i=N; i>0; i--) {
			  if(max < arr[i]) {
				  max = arr[i];
			  }
			  else if(arr[i] < max){
				ans += max-arr[i];
			  }
			  else continue;
		  }
		  
		  System.out.println("#" + t + " " + ans);
	   }
   }
}



