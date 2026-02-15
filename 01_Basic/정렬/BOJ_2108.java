import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// O(N^2)이하로 풀기
public class BOJ_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] freq = new int[8001];
        int sum =0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
            freq[arr[i]+4000]++; // -4000~4000 -> 0~8000으로 변환
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        // 1. 산술평균 + 반올림
        System.out.println(Math.round((double)sum/N));

        // 2. 중앙값
        Arrays.sort(arr);
        System.out.println(arr[N/2]);// N : 홀수(문제에서 가정)

        // 3. 최빈값 : freq(빈도) 배열 cnt
        int maxFreq = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<8001; i++){
            if(maxFreq < freq[i]){
                maxFreq = freq[i]; // 최대 빈도를 저장
                list.clear(); // 새로운 최대 빈도가 나올 경우 초기화
                list.add(i-4000); // 원래값 복원 -> -4000~4000
            } else if(freq[i]==maxFreq){
                list.add(i-4000); // 0~8000 -> 4000~4000
            }
        }
        Collections.sort(list);
        System.out.println(1 < list.size() ? list.get(1):list.get(0));
        // 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다.


        // 4. 범위 : Max - min
        System.out.println(max - min);
    }
}