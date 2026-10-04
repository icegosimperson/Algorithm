import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        recrusive(n);
    }
    public static void recrusive(int n){
        if(n==0){
            return;
        }
        System.out.print(n + " ");
        recrusive(n-1);
        System.out.print(n + " ");
    }
}