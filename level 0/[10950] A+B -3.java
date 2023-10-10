import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // n개를 입력받아 배열에 저장 -> n개를 입력받은 값을 배열에 저장
    int T = sc.nextInt();
    int[] T_arr = new int[T];
    
    for(int i=0; i<T_arr.length; i++){
      int a = sc.nextInt();
      int b = sc.nextInt();
      T_arr[i] = a+b;
    }  
    for(int j=0; j<T_arr.length; j++)
      System.out.println(T_arr[j]);
  }
}
  
