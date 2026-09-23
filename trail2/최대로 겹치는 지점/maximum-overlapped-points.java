import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[101];
        int max = 0;
        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            for(int j=start; j<=end; j++){
                arr[j] += 1;
                max = Math.max(arr[j], max);
            }
        }
        // Please write your code here.
        System.out.println(max);
    }
}