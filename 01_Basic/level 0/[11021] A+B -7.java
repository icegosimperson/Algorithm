import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 개수 입력 받음
        // 테스트 케이스를 입력 받음
        for(int i=1; i<=T; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
        	System.out.printf("Case #%d:", i);
            System.out.printf("% d\n", A+B);
        }
        sc.close();
    }
}
