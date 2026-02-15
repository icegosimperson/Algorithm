import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N  = sc.nextInt(); // 개수
    int X = sc.nextInt(); // X보다 작은 수

    // 배열에 입력 값을 받음
    int[] arr = new int[N];
    for(int i=0; i<N; i++){
      if(arr[i] <= X)
        arr[i] = sc.nextInt();
      else
        continue;
    }
    
    // X보다 작은 수 인지 확인
    for(int i=0; i<N; i++){  
      if(arr[i] < X)
        System.out.print(arr[i]+" ");
      else
        continue;
    }
  }  
    
}
  
