import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // N개의 숫자 입력
		String str = br.readLine(); // 공백 없이 입력, 1<= N <=100이니 int,long (x)
		int sum =0; // 합계 구할 변수 초기화
		
		for(int i=0; i<N; i++) {
			sum += str.charAt(i)- '0'; // 아스키코드 : 문자와 숫자의 코드 값 차이 48(= '0')
		} // charAt() 메서드를 사용해서 split 없이도 문자열의 개별 문자에 접근 가능 => 바로 추출만
		// 이유 : String은 내부적으로 char으로 배열이 구현되어 있음, 특정 구분자 X
		// 그러면 split 사용할 때 : 문자열을 특정 구분자로 나누어 배열로 변활할 때 사용됨
		System.out.print(sum);
	}
}
