import java.io.*;

public class Main {
	public static boolean isPrime(int x) {
		if(x<2) // x가 1일 경우 바로 false 반
			return false;
		for(int i=2; i<= Math.sqrt(x); i++) {
			if (x%i==0) // x가 해당 수로 나눠떨어지면 
				return false; // 소수x
		}
		return true; // x가 나누어떨어지지 않으면 소수o
	}
	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = 0;
		
		int N = Integer.parseInt(br.readLine()); // 첫 줄에 수의 개수 N
		String[] input = br.readLine().split(" "); //두번째 줄에 공백 기준으로 숫자 입
		
		for (int i = 0; i < N; i++) {
            if (isPrime(Integer.parseInt(input[i]))) { 
                count++; // 소수인 경우 count 증가
            }
        }

    bw.write(String.valueOf(count));
		bw.flush();
		bw.close();
	}
}
