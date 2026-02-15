import java.io.*;
import java.util.*;

// 시간복잡도 : O(N)
// SubString : 문자열에서 특정 구간 부분 문자열 추출 -> 부분 문자열, 패턴 찾기, 텍스트 분할
public class Solution {
   public static void main(String[] args) throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   int T = Integer.parseInt(br.readLine());
	   
	   for(int t=1; t<=T; t++) {
		   String input = br.readLine();
		   
		   for(int i=1; i<=input.length(); i++) {
			   String pattern = input.substring(0, i); // 패턴 생성
			   String end = input.substring(i, i+i); // 다음 패턴
			   
			   if(pattern.equals(end)) { // 패턴이 동일하게 반복되는지 확인
				   System.out.println("#" + t + " " + i);
				   break;
			   }
		   }
	   }
	   br.close();
   }
}
