import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		M = M-45; // 45분 앞당
		
		if(M<0) {
			M = M+60;
			H = H-1;
			if(H<0)
				H = H+24;
		}
	
		else
			H=H;
		
		System.out.printf("%d %d", H, M);
	}

}
