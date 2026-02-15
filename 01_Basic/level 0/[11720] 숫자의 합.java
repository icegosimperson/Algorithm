import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 첫줄 숫자 개수
        String num = sc.next();
        sc.close();
          
        int sum=0;
      for(int i=0; i<N; i++){
        sum += num.charAt(i) - '0'; // 아스키 코드 '0' = 48, 0(48) - 0(48) = 0
      }
        

        System.out.printf("%d", sum);
    }
}
