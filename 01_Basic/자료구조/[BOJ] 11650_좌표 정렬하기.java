import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2]; // x, y 좌표니까 2로 해도됨

        for(int i=0; i<arr.length; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        // 람다식을 이용한 Arrays.sort의 확장
        Arrays.sort(arr, (a1, a2) ->{
                if(a1[0] == a2[0]){
                    return a1[1] - a2[1];
                }
                else{
                    return a1[0] - a2[0];
                }
        });

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            sb.append(arr[i][0] + " " + arr[i][1]).append('\n');
        }
        System.out.println(sb);
    }
}

