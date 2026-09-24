import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[2001];
        int cur = 0;
        // 음수 좌표 offset 필요
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            // 2번 이상 지나간 영역의 크기를 출력(좌표x)
            int next;
            if(dir=='R'){
                next = cur + x;
            } else{
                next = cur - x;
            }
            int start = Math.min(cur, next);
            int end = Math.max(cur, next);
            for(int k=start; k<end; k++){
                arr[k+1000]++;
            }
            cur = next;
        }
        int answer = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=2){
                answer++;
            }
        }
        System.out.println(answer);
    }
}