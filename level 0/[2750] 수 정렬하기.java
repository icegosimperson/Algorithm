import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for(int j=0; j<N; j++){
            bw.write(Integer.toString(arr[j]));
            bw.newLine();
        }


        bw.flush();
        bw.close();
        br.close();
    }
}
