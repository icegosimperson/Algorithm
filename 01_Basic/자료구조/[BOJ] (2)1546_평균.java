import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = 0; // 최대 점수값

		double sum = 0.0; // 합계
		double nScore = 0; // 새로운 평균
		

		for(int i=0; i<N; i++) {
			int temp = sc.nextInt();
			if(temp>M) {
				M = temp;
			}
			sum +=temp;
		}
		
		nScore = (sum*100.0/M/N);
		

		System.out.print(nScore);
			
	}
}
