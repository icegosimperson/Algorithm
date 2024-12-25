import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 최대 랜선의 길이를 구하는 프로그램을 작성

// 매개변수 탐색 : 최적화 -> 결정 문제, 함수 -> 증가 or 감소 함수
// (최적화 문제) : N개를 만들 수 있는 랜선의 최대 길이
// (결정 문제) : 랜선 길이가 X일 때 랜선이 N개 이상인가 아닌가? (참, 거짓 여부 판단)
//      참 -> 가능한 범위를 더 넓게 탐색(더 큰값)
//      거짓 -> 범윌을 좁게 탐색(더 작은값)
public class BOJ_1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[K];
        long max = 0;

        for(int i=0; i<K; i++){
            arr[i] = Integer.parseInt(br.readLine());
            if(max<arr[i]){
                max = arr[i];
            }
        }

        max++;

        long min = 0;
        long mid = 0;
        long result = 0;

        while(min < max){
            mid = (min + max)/2;

            long cnt = 0;

            for(int i=0; i<arr.length; i++){
                cnt += (arr[i]/mid); // 중간 길이로 잘라서 총 몇개가 만들어지는지 구함
            }

            // Upper Bound
            if(cnt< N){
                max = mid;
            } else{
                min = mid+1;
            }
        }

        System.out.println(min-1);
    }
}

/*
초기 값: min = 0, max = 803

1차 계산: mid = (min + max) / 2 = 401

cnt = (802/401) + (743/401) + (457/401) + (539/401) = 2 + 1 + 1 + 1 = 5
cnt < N이므로, max = mid.
2차 계산: mid = (min + max) / 2 = 200

cnt = (802/200) + (743/200) + (457/200) + (539/200) = 4 + 3 + 2 + 2 = 11
cnt >= N이므로, min = mid + 1.
3차 계산: mid = (min + max) / 2 = 300

cnt = (802/300) + (743/300) + (457/300) + (539/300) = 2 + 2 + 1 + 1 = 6
cnt < N이므로, max = mid.
4차 계산: mid = (min + max) / 2 = 250

cnt = (802/250) + (743/250) + (457/250) + (539/250) = 3 + 2 + 1 + 2 = 8
cnt < N이므로, max = mid.
최종 결과: min = 201, max = 201.

min - 1 = 200
 */