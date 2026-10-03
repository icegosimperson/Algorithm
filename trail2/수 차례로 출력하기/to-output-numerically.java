import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        recrusive1(n);
        System.out.println();
        recrusive2(n);
    }
    public static void recrusive1(int n){
        if(n==0){
            return;
        }
        recrusive1(n-1);
        System.out.print(n + " ");
    }
    public static void recrusive2(int n){
        if(n==0){
            return;
        }
        System.out.print(n + " ");
        recrusive2(n-1);
    }
}