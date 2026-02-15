import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int count =1;
        int start_index =1;
        int end_index = 1;
        int sum = 1;

        while(end_index != N){
            if(sum == N){
                count++;
                end_index++;
                sum += end_index; // sum 값 변경
            }
            else if(sum > N){
                sum -= start_index; // sum값 변경
                start_index++;
            }
            else if (sum < N) {
                end_index++;
                sum += end_index; // sum값 변경
            }
        }
        System.out.println(count);
    }
}

