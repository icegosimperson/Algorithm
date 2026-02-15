import java.io.*;
import java.util.*;

// 구간 나누는 방법 : 
// 평균 출력 
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] score = new int[N];
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            score[i] = Integer.parseInt(st.nextToken()); // 배열로 입력 받을까
        }

        // 구간 나누기
        for(int i=0; i<K; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int sum = 0;
            for(int j=a-1; j<b; j++){
                sum += score[j];
            }
            System.out.printf("%.2f\n", (double)sum/(b-a+1));
        }
    }
}
