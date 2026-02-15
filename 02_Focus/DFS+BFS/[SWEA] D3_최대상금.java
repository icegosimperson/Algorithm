// https://swexpertacademy.com/main/code/problem/problemDetail.do?problemLevel=3&contestProbId=AV15Khn6AN0CFAYD&categoryId=AV15Khn6AN0CFAYD&categoryType=CODE&problemTitle=&orderBy=RECOMMEND_COUNT&selectCodeLang=ALL&select-1=3&pageSize=10&pageIndex=1
import java.util.*;
import java.io.*;

// 시간 복잡도 : 6C2 = 15, 15^10 -> 시간 초과
public class Solution {
	static int max;
	static char[] nums;
	static int limit;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int t=1; t<=T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			nums = st.nextToken().toCharArray(); // 문자 배열로 변환(int 타입보다 교환 복구를 쉽게 하기 위함)
			limit = Integer.parseInt(st.nextToken()); // 교환 횟수
			max=0;
			dfs(0, 0); // dfs로 탐색
			System.out.println("#" + t + " " + max);
		}
	}
	static void dfs(int pos, int cnt) { // (현재 탐색 위치, 교환 횟수)
		if(cnt==limit) { // 교환 횟수가 끝나면
			int value = Integer.parseInt(new String(nums)); // 다시 int타입으로 변환
			max = Math.max(max,  value); // 최댓값 출력
			return; // 종료
		}
		for(int i=pos; i<nums.length; i++) { // 가능한 모든 자리 교환 수행
			for(int j=i+1; j<nums.length; j++) { // i+1번째부터 탐색하여 중복 최소화
				swap(i, j);
				dfs(i, cnt+1); // 재귀 호출
				swap(i, j);
			}
		}
	}
	static void swap(int i, int j) {
		char temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
