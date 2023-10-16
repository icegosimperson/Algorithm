// #1 일반 반복문 풀이 *(N-i)
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N  = sc.nextInt(); // 개수
    int factorial = 1;
    
    for(int i=0; i<N; i++){
      factorial *= (N-i);     
    }
    System.out.println(factorial);
  }    
}

// #2 일반 반복문 풀이 *i
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N  = sc.nextInt(); // 개수
    int factorial = 1;
    
    for(int i=1; i<=N; i++){
      factorial *= i;     
    }
    System.out.println(factorial);
  }    
}

// #3 재귀함수 이용
import java.util.Scanner;

public class Main{
  public static int factorial(int N){
  if(N<=1)
    return 1;
  else 
    return N * factorial(N-1);
  }
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    int result = factorial(N);
    System.out.println(result);
    
  }
}
