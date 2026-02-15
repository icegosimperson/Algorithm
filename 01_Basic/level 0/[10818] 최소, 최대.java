import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); // 숫자의 개수
    int arr[] = new int[N]; // 입력 받은 숫자 만큼 배열에 저장 

    
    for(int i=0; i<N; i++){
      arr[i] = sc.nextInt(); // 숫자를 저장
    }
    
    Arrays.sort(arr);
    int max=arr[N-1];;
    int min=arr[0]; // 최솟값 최대값 선언

    System.out.printf("%d %d", min, max);

  }
}
