import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // N개의 수 입력
        long A[] = new long[N]; // 배열 선언
        int result = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) { // 배열 값 입력 받기
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A); // 효율적으로 합을 구하기 위해 오름차순 정렬

        for(int k=0; k<N; k++){
            long find = A[k];
            int i = 0;
            int j = N-1;
            while(i < j){
                if(A[i] + A[j] == find){
                    if(i != k && j!=k){
                       result++;
                       break;
                    } else if(i==k){  // 자기 자신일 경우 건너뜀
                        i++;
                    } else if(j==k){ // 자기 자신일 경우 건너뜀
                        j--;
                    }
                }
                else if(A[i] + A[j] < find) i++;
                else  j--;
            }
        }
        System.out.println(result);
        br.close();
     }
}


