import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(F(n));
    }
    public static int F(int n){
        int ans = 0;
        if(n%2==0){ // 짝수
            for(int i=2; i<=n; i+=2){
                ans += i;
            }
        }else{ // 홀수
            for(int i=1; i<=n; i+=2){
                ans += i;
            }
        }
        return ans;
    }
}