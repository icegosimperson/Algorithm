import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();
		
		int result = A*B*C;
		int[] count = new int[10]; 

		while(result>0) {
			count[result % 10]++;
			result/=10;
		}
		
		for(int i=0; i<count.length; i++)
			System.out.println(count[i]);

	
	}

}
