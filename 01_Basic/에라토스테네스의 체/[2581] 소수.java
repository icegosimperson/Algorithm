import java.io.*;
import java.util.*;

public class Main {
    // 소수 판별 함수
    public static boolean isPrime(int x){
        if(x<2)
            return false; // 1은 소수가 아님
        for(int i=2; i<=Math.sqrt(x); i++){
            if(x % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // M ~ N 까지 범위
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int primeSum = 0; // 소수 합 저장 변수
        int minPrime = Integer.MAX_VALUE;  // 소수가 없는 경우 대비 -1로 설정
        boolean hasPrime = false; // 소수가 없으면

        for(int j=M; j<=N; j++){
            if(isPrime(j)) { // 배열로 소수 값 저장해
                hasPrime = true;
                primeSum += j;
                minPrime = Math.min(minPrime, j);
            }
        }

        if(hasPrime){
            bw.write(String.valueOf(primeSum)+"\n");
            bw.write(String.valueOf(minPrime));
        }

        else
            bw.write(String.valueOf(-1));


        bw.flush();
        br.close();
        bw.close();
    }
}
