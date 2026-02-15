import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt(); // 구매한 각 물건의 가격
    int N = sc.nextInt(); // 구매한 물건의 종류 개수
    int a, b=0;
  
    int total=0; //  모든 종류의 합
    
    for(int i=0; i<N; i++){ // 물건의 종류 개수 만큼 반복
      // 배열에 저장 0~N가지까지에 입력 값을 저장 받음 
      a= sc.nextInt(); // 가격과 물건 개수를 N번 입력 받음
      b = sc.nextInt();
      total += a * b;
    }  
    
    if(X == total)
      System.out.println("Yes");
    else 
      System.out.println("No");
  }
}
  
