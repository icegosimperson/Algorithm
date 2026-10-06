import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        recursive(arr, 0, 1);
    }
    public static void recursive(int[] arr, int idx, int ans){
        if(arr.length==idx){
            System.out.println(ans);
            return;
        }
        recursive(arr, idx+1, lcm(arr[idx], ans));
    }
    public static int lcm(int a, int b){
        return a * b / gcd(a, b);
    }
    public static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b, a%b);
    }
}