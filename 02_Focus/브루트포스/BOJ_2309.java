import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BOJ_2309{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int sum = 0;
        for(int i=0; i<9; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        for(int i=0; i<8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - arr[i] - arr[j] == 100) { // 일곱 난쟁이의 합이 100이 되어야함
                    arr[i] = 0;
                    arr[j] = 0;
                    Arrays.sort(arr);
                    for (int k = 2; k < 9; k++) {
                        System.out.println(arr[k]);
                    }
                    return; // 여기 왜 return이 없으면 틀리는 이유 : 불필요한 반복이 계속 진행
                }
            }
        }
    }
}