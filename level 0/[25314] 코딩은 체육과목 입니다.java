import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		int count=0;
		count = N/4;
		
		for(int i=0; i<count; i++)
			System.out.print("long ");
		System.out.print("int");
	}
}
