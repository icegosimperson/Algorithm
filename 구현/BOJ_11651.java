import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// O(N^2)이하로 풀기
public class BOJ_11651 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][2];

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken()); // y
            arr[i][1] = Integer.parseInt(st.nextToken()); // x
        }
        //  좌표를 y좌표가 증가하는 순으로, y좌표가 같으면 x좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램
        Arrays.sort(arr, (a, b)->{
            if(a[1] == b[1]){ // y 좌표가 같다면
                return a[0] - b[0]; // x 좌표 오름차순
            } else{
                return a[1] - b[1]; // y 좌표 같다면 x 좌표 오름차순
            }
        });
        for(int i=0; i<N; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}