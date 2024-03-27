import java.io.*;

public class Main{
       static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       public static void main(String[] args) throws IOException{
	       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        
	       int N = Integer.parseInt(br.readLine());
	       int count =0;
	       
	       for(int i=0; i<N; i++) {
	    	   if(check() == true) {
	    		   count++;
	    	   }
	       }
	
	       bw.write(String.valueOf(count));
	          
	       br.close();
	       bw.flush();
	       bw.close();
       }

	   public static boolean check() throws IOException { // 그룹 단어를 체크할 함수
	 	   boolean[] check = new boolean[26]; // 그룹 단어를 판단하기 위한 boolean 배열 생성 
	 	   int prev = 0;
	 	   String str = br.readLine();
	 	   
	 	   for(int i=0; i<str.length(); i++) {
	 		   int now = str.charAt(i); // 현재 문자를 저장하는 변수
	 		   
	 		   if(prev != now) { // 새로운 문자가 나온 경우 : (이전 문자 != 현재 문자) 
	 			   if(check[now -'a'] == false) { // 이전에 등장한 적 없는지 확인(now-'a' 알파벳 인덱스로 변환)
	 				   check[now -'a'] = true; // 이전에 등장하지 않았으므로 check 배열에 'true' 표시
	 				   prev = now; // 이전 문자 = 현재 문자 대입 후 다음 반복문 실행
	 			   }
	 			   else { // 이미 나온 문자일 경우 -> 그룹 단어가 아님
	 				   return false; // 거짓 반환 (종료)
	 			   }
	 		   }
	 		   
	 		  // 연속된 문자일 경우 (이전 문자 == 현재 문장)
	 		   else
	 			  continue;
	 	   }
	 	   return true;
	    }
    
}
