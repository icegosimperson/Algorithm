import java.io.*;
import java.util.StringTokenizer;

class BOJ_17276{
    static int[][] arr;
    static int[][] copy;
    static int n, d;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        while(T-->0){
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken()); // 배열의 크기
            d = Integer.parseInt(st.nextToken()); // 각도 45의 배수 (양수 -> 시계 방향, 음수->반시계)
            if(d<0) d+= 360; // 음수일 경우 360도 회전
            d /= 45;

            arr= new int[n][n];
            copy = new int[n][n];
            for(int i=0; i<n; i++){
                st = new StringTokenizer(br.readLine());
                for(int j=0; j<n; j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                    copy[i][j] = arr[i][j];
                }
            }

            while(d-->0){
                rotate();
            }
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    sb.append(arr[i][j] + " ");
                }
                sb.append("\n");
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    private static void rotate(){
        for(int i=0; i<n; i++){
            copy[i][n / 2] = arr[i][i]; // 주대각선 -> 가운데 열
            copy[n - i - 1][i] = arr[n - i - 1][n / 2]; // 가운데 열 -> 부대각선
            copy[n / 2][i] = arr[n - i - 1][i]; // 부 대각선 -> 가운데 행
            copy[i][i] = arr[n / 2][i]; // 가운데 행 -> 주대각선
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = copy[i][j];
            }
        }
    }
}