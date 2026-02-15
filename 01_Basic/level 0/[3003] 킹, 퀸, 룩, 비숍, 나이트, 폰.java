import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {    
    int[] arr = new int[] {1, 1, 2, 2, 2, 8}; // 배열 생성
    int[] arr2 = new int[6];
    int[] result = new int[6];
    
    Scanner sc = new Scanner(System.in);
    for(int i=0; i<arr.length; i++){
      int input = sc.nextInt();
      arr2[i] =  input;
    }  
    sc.close();

  for(int j=0; j<arr.length; j++)
			result[j]=arr[j]-arr2[j];
    
  for(int k=0; k<result.length; k++)
    System.out.printf(result[k]+" ");
  
  }
}
  
