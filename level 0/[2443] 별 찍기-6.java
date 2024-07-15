import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0; i<N; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int z=2*N-2*i-1; z>0; z--){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}

