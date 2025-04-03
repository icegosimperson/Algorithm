import java.io.*;
import java.util.StringTokenizer;

// 캥거루가 움직일 수 있는 최대 횟수 구하기

/*
의문점
TC가 몇개지? -> 주어지지않음 -> 무한 루프 -> 종료 조건은 EOF로

 */
class BOJ_11034{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String S;

        while((S=br.readLine())!=null){ // 입력이 끝나기 전까지 계속 실행됨
            StringTokenizer st = new StringTokenizer(S);
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            int max = Math.max((B-A), (C-B));
            bw.write(String.valueOf(max-1));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}