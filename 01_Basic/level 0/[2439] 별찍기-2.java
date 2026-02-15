import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    for(int i=0; i<N; i++){
      // 공백 출력
      for(int z=N; z>i+1; z--)
        System.out.printf(" ");
      for(int j=0; j<i+1; j++)
        System.out.printf("*");
      System.out.println();
    }
  
  }
}
