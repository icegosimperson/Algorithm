import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0; i<N; i++){
            for(int j=N-1; j>i; j--){
                System.out.print(" ");
            }
            for(int z=0; z<2*i+1; z++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
