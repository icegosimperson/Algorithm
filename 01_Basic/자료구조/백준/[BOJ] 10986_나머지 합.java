import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 수의 개수
        int M = sc.nextInt(); // 나누어 떨어질 수

        long[] Sum = new long[N];
        long[] Arr = new long[M];
        long count = 0;
        Sum[0] = sc.nextInt();
      
        for(int i=1; i<N; i++){ // 합 배열 만들기
            Sum[i] = Sum[i-1] + sc.nextInt();
        }

        for(int i=0; i<N; i++){
            int remainder = (int) (Sum[i] % M); // 합 배열을 M으로 나눈 나멎
            if (remainder == 0) count++; // 개별 합배열이 0이면 count 증가
            Arr[remainder]++; // 배열에도 증가
        }

        for(int i=0; i<M; i++){ // 조합 이용해서 누적합이 2개 이상인 경우 count 증가
            if(Arr[i] > 1){
                count = count + (Arr[i] * (Arr[i] -1) / 2);
            }
        }
        System.out.println(count);
     }
}



