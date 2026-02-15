// 선택정렬 시 인덱스 번호를 비교하는 이유 : swap시 정확한 위치(인덱스)에서 값을 교환하기 위함
// 최대값을 나누고 swap하는 이유 : 최대값을 찾는 경우에만 swap하기 위함


import java.util.Scanner;
// 시간 복잡도 : 버블 정렬 O(N^2)
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] A = new int[str.length()];

        for(int i=0; i<str.length(); i++){
            A[i] = Integer.parseInt(str.substring(i, i+1));
        }

        for(int i=0; i<str.length(); i++){
            int Max = i;
            for(int j=i+1; j<str.length(); j++){ // 1) 최대값 찾기
                if(A[j] > A[Max]){
                    Max = j;
                }
            }
            if(A[i] < A[Max]){ // 2) swap
                int temp = A[i];
                A[i] = A[Max];
                A[Max] = temp;
            }
        }

        for(int i=0; i<str.length(); i++){
            System.out.print(A[i]);
        }
    }
}


