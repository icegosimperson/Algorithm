import java.util.Scanner;
/*
답 = 원소값들의 합
후보 = 1~N까지 부분합?
후보 하나 검증 = 시작 위치를 잡는 
N=5, M=3
arr = {5, 1, 4, 2, 3}
시작위치 k=0, {3, 1, 4, 2, 5} 반복횟수 1 (이동값 +=5)
            {4, 1, 3, 2, 5} 반복횟수2 (이동값 +=3)
            {2, 1, 3, 4, 5} 반복횟수 3 (이동값 +=4) -> 총 12
반복되는 것 
= 1. 시작 위치 (0~n)
= 2. 움직임을 M번 반복
기억할 것 
= 1. 이전에 계산했던 원소값들의 합 (최댓값을 구해서 출력하기 위함)
= 2. 이동값 갱신을 위한 move 변수 추가
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        int max = Integer.MIN_VALUE;
        for(int start=1; start<=n; start++){
            int sum = 0;
            int cur = start;
            for(int k=1; k<=m; k++){
                cur = arr[cur];
                sum += cur;
            }
            max = Math.max(max, sum);
        }
        System.out.println(max);
    }
}