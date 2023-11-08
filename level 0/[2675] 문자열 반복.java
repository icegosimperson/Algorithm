import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int T = sc.nextInt(); // 테스트 케이스의 개수
  
    	for(int a=0; a<T; a++) {
    	   int R= sc.nextInt();
    	   String S = sc.next();
    	   String[] arr= S.split(""); // 한글자씩 쪼갠 문자열을 저장 
    	   
	   
    	   for(int i=0; i<arr.length; i++) {
    		   for(int j=0; j<R; j++) {
				System.out.print(arr[i]);
    		   }
    	  }
    	   System.out.println();
    	}
    	sc.close();
   }
}

