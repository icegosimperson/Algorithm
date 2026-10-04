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
        for(int i=0; i<n; i++){
            System.out.print("*" + " ");
        }
        System.out.println();
        recrusive(n-1);
        for(int i=0; i<n; i++){
            System.out.print("*" + " ");
        }
        System.out.println();
    }
}