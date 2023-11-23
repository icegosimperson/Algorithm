import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 개수 입력 받음
        
        // 테스트 케이스를 입력 받음
        for(int i=0; i<T; i++){
            String[] input = sc.next().split(","); // ,와 정수 분리 하기 위해 split 사용 (먼저 문자열 배열 선언 필요)
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);
            System.out.println(A+B);
        }
        sc.close();
    }

}
