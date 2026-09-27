import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        // Please write your code here.
        int max = 0;
        for(int i=0; A*i<=C; i++){
            for(int j=0; A*i + B*j <= C; j++){
                int sum = A * i + B * j;
                max = Math.max(sum, max);
            }
        }
        System.out.println(max);
    }
}