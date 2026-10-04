import java.util.Scanner;
public class Main {
    static int ans = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(F(n));

    }
    public static int F(int n){
        if(n<10){
            return (int) Math.pow(n, 2);
        }
        return F(n/10) + (int) Math.pow((n%10), 2);
    }
}