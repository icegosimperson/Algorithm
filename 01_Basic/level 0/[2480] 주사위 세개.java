import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		int max=0;
		
		if(a==b && b==c) {
			System.out.print(10000+a*1000);
		}
		
		else if(a!=b && b!=c && a!=c){ // 모두 다를 경
			// 가장 큰 눈의 크기 
			if (a<b) {
				if(b<c) 
					max = c;
				else max = b; // (a<b, c<b)
			} else if(b<a) { // (b<a
				if(c<b)  // (c<b<a)
					max = a;
				else if (c<a) max = a; // b<c<a
				else max = c; // b<a<c
			}	
			
			else if (a<c) {
				if(c<b) // a<c<b
					max =b;
				max = c; // c>b>a
			}
			System.out.print(max*100);
		
		}
		else {
			if(a==b)
				max = a;
			else if(b==c)
				max = b;
			else 
				max = c;
		System.out.print(1000+max*100);
		}
	}
}
