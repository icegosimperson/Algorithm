import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        // 이전 두 항의 합이 그 다음 항이 되는 수열
        System.out.println(F(n));
    }
    public static int F(int n){
        if(n==1){
            return 1;
        } 
        if(n==2){
            return 1;
        }
        return F(n-1) + F(n-2);
    }
}