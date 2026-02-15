import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int nFactorial = 1;
        int kFactorial = 1;
        int nkFactorial = 1;

        for(int i=1; i<=N; i++){
            nFactorial *= i;
            if(i==K){
                kFactorial *= nFactorial;
            }
            if(i==(N-K)){
                nkFactorial *= nFactorial;
            }
        }

        System.out.println(nFactorial/(kFactorial*nkFactorial));

        sc.close();
    }
}

