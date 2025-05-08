import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 시간 복잡도 : N<=1,000,000 O(N) 이하로 풀어야함
class D2_1989_2
{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int tc = 0;
        while(T-->0) {
            String input = br.readLine();
            char[] arr = input.toCharArray();
            int length = arr.length;

            boolean check = true;
            for (int i = 0; i < length/2; i++) {
                if (arr[i] != arr[length - i-1]) {
                    check = false;
                    break;
                }
            }

            tc++;
            if (check) {
                System.out.println("#" + tc + " " + 1);
            } else {
                System.out.println("#" + tc + " " + 0);
            }
        }
    }
}
