import java.util.Scanner;

// 시간 복잡도 : 시간 제한 1초, 장애물의 크기 : O(NlogN)
public class Main {
    public static void main(String[] args) {
      // 개똥벌레가 파괴해야 하는 장애물의 최솟값과 그러한 구간의 수 출력
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }

        // 버블 정렬
        for(int i=0; i<N-1; i++){
            for(int j=0; j<N-1-i; j++){
                if(A[j]>A[j+1]){
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }
        for(int i=0; i<N; i++){
            System.out.println(A[i]);
        }

    }
}
