import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int t=1; t<=T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int arr[] = new int[10];
			int sum = 0;
			for(int i=0; i<10; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				if(arr[i]%2==1) {
					sum += arr[i];
				}
			}
			System.out.println("#" + t + " " + sum); 
		}
   }
}
