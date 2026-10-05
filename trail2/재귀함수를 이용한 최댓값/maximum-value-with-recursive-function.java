import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(arr[i], max);
        }
        // 첫번째 줄에 주어지는 원소 중 최댓값 출력
        // 재귀함수로 어떻게 최댓값을 출력하지?
        System.out.println(max);
    }
}