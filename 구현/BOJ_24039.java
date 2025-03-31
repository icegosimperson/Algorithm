import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 어떤 수가 연속한 두 소수의 곱으로 이루어져 있으면 특별한 수
// 연속한 두 소수의 곱 중 가장 작은 수 찾기


class BOJ_24039{
    private static boolean isPrime(int n){
        if(n==1) return false;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int firstPrime = 2; // 첫 소수
        int curPrime = 3; //
        // 연속한 두 소수의 곱을 만들어보기
        while(true){
            if(isPrime(curPrime)){ // 현재 숫자가 소수라면
                int temp = firstPrime * curPrime;
                if(temp > N) { // N보다 큰 소수라면
                    System.out.println(temp);
                    return;
                }
                firstPrime = curPrime; // 다음 소수로 갱신
            }
            curPrime++;
        }
    }
}

/*
연속된 두 소수의 곱을 만들며 N이상인지 확인 해야 함
N이 소수인지는 판단 X
연속한 소수 두개를 곱해서 나온 수가 N이상인지 보기
        if(isPrime(N)){ // 소수일 경우

        } else System.out.println(N); // 소수가 아닐 경우
 */
