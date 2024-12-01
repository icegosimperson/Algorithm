import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] target = new int[N][2];

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            target[i][0] = Integer.parseInt(st.nextToken());
            target[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(target, (a, b) -> { // 끝나는 시간 기준 오름차순 정렬
           if(a[1]==b[1]){ // 끝나는 시간이 같을 경우
                return Integer.compare(a[0], b[0]); // 시작 시간 기준 오름차순
           }
           return Integer.compare(a[1], b[1]); // 끝나는 시간 기준 오름차순 정렬
        });

        int cnt = 0;
        int endTime = 0; // 현재 회의 시간
        for(int i=0; i<N; i++){
            if(endTime<=target[i][0]){ // 현재 회의 종료 시간보다 시작 시간이 더 크면
                   endTime = target[i][1];
                   cnt++;
            }
        }
        System.out.println(cnt);
    }
}

