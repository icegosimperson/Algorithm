import java.util.Scanner;
public class Main {
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        F(n);
        System.out.println(count);
    }
    public static int F(int n){
        if(n==1){
            return 0;
        }
        count++;
        int remain = n%3;
        if(n%2==0){
            return F(n/2);
        } else{
            return F(n/3) + remain ;
        }
    }
}