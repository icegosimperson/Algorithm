import java.util.Scanner;

public class Main {
  public static void main(String[] args) {    
    Scanner sc = new Scanner(System.in);

    int A, B;
    do{
      A = sc.nextInt();
      B = sc.nextInt();

      if(A<B)
        System.out.println("No");
      else if(A==B && A !=0 && B!=0) // else System.println("no") 변경 가능
        System.out.println("No");
      else if(A>B)
        System.out.println("Yes"); 

      if (A == 0 && B == 0) 
        break; 
    } while (A != 0 || B != 0);
    sc.close();
  }
}
  
