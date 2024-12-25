import java.io.*;
import java.util.*;

// 매개 변수 탐색
// 중복 원소에 대한 길이 = (upper bound - lower bound)
public class BOJ_10816 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	int N = Integer.parseInt(br.readLine());
    	int[] arr = new int[N];
    	
    	st = new StringTokenizer(br.readLine());
    	for(int i=0; i<N; i++) {
    		arr[i] = Integer.parseInt(st.nextToken());
    	}
    	Arrays.sort(arr);
    	
    	int M = Integer.parseInt(br.readLine());
    	StringBuilder sb = new StringBuilder();
    	st = new StringTokenizer(br.readLine());
    	for(int i=0; i<M; i++) {
    		int key = Integer.parseInt(st.nextToken());
    		
    		sb.append(upperBound(arr, key) - lowerBound(arr, key)).append(' ');
    	}
    	System.out.println(sb);
    }
    private static int lowerBound(int[] arr, int key) {
    	int left = 0;
    	int right = arr.length;
    	
    	while(left<right) {
    		int mid = (left + right)/2;
    		
    		if(key<=arr[mid]) {
    			right = mid;
    		} else {
    			left = mid+1;
    		}
    	}
    	return left;
    }
    
    private static int upperBound(int[] arr, int key) {
    	int left = 0;
    	int right = arr.length;
    	
    	while(left<right) {
    		int mid = (left + right)/2;
    		if(key<arr[mid]) {
    			right=mid;
    		}else {
    			left = mid+1;
    		}
    	}
    	return left;
    }
}
