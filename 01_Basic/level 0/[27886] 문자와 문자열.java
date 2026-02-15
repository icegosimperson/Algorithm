import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String S = sc.nextLine();
    int index = sc.nextInt();
    
    System.out.println(S.charAt(index-1));
  }
}
  
