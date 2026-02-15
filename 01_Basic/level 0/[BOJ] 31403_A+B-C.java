import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        System.out.println(A+B-C); 

        String sA = String.valueOf(A);
        String sB = String.valueOf(B);
        String sC = String.valueOf(C);
        String AB = sA + sB;
        int iAB = Integer.parseInt(AB);
        int iC = Integer.parseInt(sC);
        System.out.println(iAB - iC);
    }
}

