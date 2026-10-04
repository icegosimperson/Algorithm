import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(recursive(n));
    }
    public static int recursive(int n){
        if(n==1){
            return 1;
        }
        return recursive(n-1) + n;
    }
}