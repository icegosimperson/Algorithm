// 1부터 n까지 합을 출력 
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.printf("%d", n*(n+1)/2);
  }
}
  
