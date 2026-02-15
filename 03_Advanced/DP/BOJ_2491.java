import java.io.*;
import java.util.StringTokenizer;

// 수열 안에서 연속해서 커지거나 (같은 것 포함)
// 연속해서 작아지는 것 (같아지 것) 중 가장 길이가 긴 것을 찾아내서 그 길이를 출력
class BOJ_2491{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] asc = new int[N];
        int[] desc = new int[N];
        asc[0] = 1;
        desc[0] = 1;
        int result = 1;
        for(int i=1; i<N; i++){
            if(arr[i] >= arr[i-1]){ // 증가할 경우
                asc[i] = asc[i-1] +1;
            } else {
                asc[i] = 1;
            }
            if(arr[i] <= arr[i-1]){ // 감소할 경우
                desc[i] = desc[i-1]+1;
            } else{
                desc[i] = 1;
            }
            result = Math.max(result, Math.max(asc[i], desc[i]));
        }
        ;
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
