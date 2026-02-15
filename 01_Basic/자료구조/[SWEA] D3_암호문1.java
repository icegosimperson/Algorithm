import java.io.*;
import java.util.*;

// 배열에 삽입, 삭제가 많은 경우 LinkedList 사용
public class Solution {
	public static void main(String[] args) throws IOException {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   for(int t=1; t<=10; t++) {
		   LinkedList<Integer> list = new LinkedList<>();
		   
		   int N = Integer.parseInt(br.readLine()); // 원문 암호문 길이
		   
		   StringTokenizer st = new StringTokenizer(br.readLine());
		   for(int i=0; i<N; i++) { // 원문 암호문 list에 추가
			   list.add(Integer.parseInt(st.nextToken()));
		   }
		   
		   N = Integer.parseInt(br.readLine()); // 명령어 개수
		   
		   st = new StringTokenizer(br.readLine());
		   for(int i=0; i<N; i++) { // 삽입할 암호문 
			   if(st.nextToken().equals("I")) {
				   int x = Integer.parseInt(st.nextToken());
				   int y = Integer.parseInt(st.nextToken());
				   for(int j=0; j<y; j++) {
					   list.add(x, Integer.parseInt(st.nextToken()));
					   x++;
				   }
			   }
		   }
		   System.out.print("#" + t + " "); // 수정 필요
		   for(int i=0; i<10; i++) {
			   System.out.print(list.get(i) + " ");
		   } System.out.println();
	   }
	   
   }
}
