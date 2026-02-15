import java.io.*;
import java.util.*;

// 시간복잡도 : M <= 2_000_000 -> O(N^2) 불가
public class Solution {
   public static void main(String[] args) throws Exception {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int T = Integer.parseInt(br.readLine());
	   
	   for(int t=1; t<=T; t++) {
		   StringTokenizer st = new StringTokenizer(br.readLine());
		   int N = Integer.parseInt(st.nextToken()); // 과자 봉지 개수
		   int M = Integer.parseInt(st.nextToken()); // 무게 합 제한
		   
		   int[] snacks = new int[N];
		   st = new StringTokenizer(br.readLine());
		   for(int i=0; i<N; i++) {
			   snacks[i] = Integer.parseInt(st.nextToken());
		   }
		   
		   Arrays.sort(snacks);
		   int answer = 0;
		   
		   int left =0;
		   int right = N-1;
		   int max = -1;
		   
		   while(left < right) {
			   int sum = snacks[left] + snacks[right];
			   if(sum>M) {
				   right--;
			   } 
			   else {
				   max = Math.max(max, sum);
				   left++;
			   }
		   }
		   System.out.println("#" + t + " " + max);
	  }
   }
}
