import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String number = String.valueOf(factorial(N));
        int count =0;
        for(int i=number.length()-1; i>=0; i--){
            if(number.charAt(i) == '0'){
                count++;
            }
            else
                break;
        }
        System.out.println(count);
        sc.close();
    }

    static BigInteger factorial(int N) {
        if (N <= 1) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(N).multiply(factorial(N - 1));
    }
}

