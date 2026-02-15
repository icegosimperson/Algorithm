import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class BOJ_16466{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        for(int i=0; i<N; i++){
            if(arr[i] != i+1){ // 중간에 빠진 번호가 있으면
                System.out.println(i+1); // 출력 후 종료
                return;
            }
        }
        System.out.println(N+1); // 빠진 번호가 없으면 N+1 출력
    }
}
/*
int min = Integer.MAX_VALUE;
        for(int i=0; i<N; i++){
            min = Math.min(arr[i], min);
        }
 */