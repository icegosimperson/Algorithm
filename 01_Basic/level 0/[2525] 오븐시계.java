import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		int input = sc.nextInt();
		sc.close();
		
		M = M + input;
		
		if(M>=60) {
			H += M/60;
			M = M%60;
			
			if(H>23)
				H = H-24;
		}
		System.out.printf("%d %d", H, M);
	}

}
