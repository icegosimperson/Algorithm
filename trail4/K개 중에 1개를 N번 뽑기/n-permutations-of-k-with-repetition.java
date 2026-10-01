/*
답 =
후보 =
후보 하나 검증 =
반복되는 것 =
기억할 것 =
매 턴 실제로 바뀌는 상태 =

*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        // Please write your code here.
        int[] arr = new int[n]; // 현재까지 선택한 경로
        dfs(arr, 0, k, n);
    }
    public static void dfs(int[] arr, int depth, int k, int n){
        if(depth==n){
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }
        for(int i=1; i<=k; i++){
            arr[depth] = i;
            dfs(arr, depth+1, k, n);
        }
    }
}