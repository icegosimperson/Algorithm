import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] x_arr = new int[3];
        int[] y_arr = new int[3];

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            x_arr[i] = Integer.parseInt(st.nextToken());
            y_arr[i] = Integer.parseInt(st.nextToken());
        }

        br.close();
        bw.write(findAixs(x_arr) + " " + findAixs(y_arr));
        bw.flush();
        bw.close();
    }

    static int findAixs(int[] array) {
        if (array[0] == array[1]) { // 중복된 값이 2개 있을 경우
            return array[2]; // 중복되지 않은 값 1개 출력
        } else if (array[0] == array[2]) { // array[0] != array[1]
            return array[1];
        } else  { // array[1] != array[2]
            return array[0];
        }

    }

}
