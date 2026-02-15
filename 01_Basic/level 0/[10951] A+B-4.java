import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int A, B=0;
    
    while(sc.hasNextInt()) {
        A = sc.nextInt(); // 구매한 각 물건의 가격
        B = sc.nextInt(); // 구매한 물건의 종류 개수
        System.out.printf("%d\n", A+B);	
    }  
	sc.close();
  }
}
  
