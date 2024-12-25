import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int X = Integer.parseInt(br.readLine());
        int cross_count = 1; // 대각선의 개수
        int prev_count_sum = 0; // 직전 대각선까지 누적 칸의 개수

        while(true){
            // 직전 대각선 누적합 + 해당 대각선 개수 이용한 범위 판별
            if (X <= prev_count_sum + cross_count) {
                if (cross_count % 2 == 1) { // 대각선의 개수가 홀수일 경우
                    bw.write(String.valueOf(cross_count - (X - prev_count_sum - 1) + "/" + (X - prev_count_sum)));
                    break;
                } else { // 대각선의 개수가 짝수인 경우
                    bw.write(String.valueOf((X - prev_count_sum) + "/" + (cross_count - (X - prev_count_sum - 1))));
                    break;
                }
            }

            else{
                prev_count_sum += cross_count;
                cross_count++;
            }
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
