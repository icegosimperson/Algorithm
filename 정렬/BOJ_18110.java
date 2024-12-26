import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_18110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if(N==0){ // 난이도가 없는 경우
            System.out.println(0);
            return;
        }
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int div = (int)Math.round(N*0.15);

        Arrays.sort(arr); // 정렬하기

        // Max div개, Min div개 제외
        double sum = 0;
        for(int i=div; i<N-div; i++){
            sum += arr[i]; // 원소를 제거할 필요 없이 제외하고 평균 계산
        }

        double avg = sum / (N-div*2);
        System.out.println((int)Math.round(avg));
    }
}