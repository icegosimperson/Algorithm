import java.util.Scanner;

// 각 사람이 돈을 인출하는데 필요한 시간의 합의 최솟값
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int A[] = new int[N];
        int S[] = new int[N];
        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }

        for(int i=1; i<N; i++){ // 삽입 위치 찾기
            int insert_point = i; // 삽입 인덱스
            int insert_value = A[i]; // 삽입 값
            for(int j=i-1; j>=0; j--){ // 삽입될 위치 찾기
                if(A[j] < A[i]){
                    insert_point = j+1;
                    break;
                }
                if(j==0){
                    insert_point =0;
                }
            } // j--
            for(int j=i; j>insert_point; j--){ // 삽입을 위해 오른쪽으로 한칸씩 민다
                A[j] = A[j - 1];
            }
            A[insert_point] = insert_value;
        }
        // 대기 시간 계산
        S[0] = A[0]; // 첫번째 사람은 대기 X
        for(int i=1; i<N; i++){
            S[i] = S[i - 1] + A[i];
        }
        int sum=0;
        for(int i=0; i<N; i++){ // 누적합
            sum += S[i];
        }
        System.out.println(sum);
    }
}


