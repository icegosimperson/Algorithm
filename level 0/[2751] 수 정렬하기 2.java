import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<N; i++){
           list.add(Integer.parseInt(br.readLine()));
        }
        br.close();
        Collections.sort(list);

        for(int num : list) {
            bw.write(num + "\n");
        }

        bw.flush();
        bw.close();
    }
}
