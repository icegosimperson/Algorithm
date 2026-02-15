import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[5];
        int sum = 0;
        for(int i=0; i<5; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        Arrays.sort(arr);

        bw.write(Integer.toString(sum/5));
        bw.write("\n");
        bw.write(Integer.toString(arr[2])); // 중앙값 출력

        bw.flush();
        bw.close();
        br.close();
    }
}
