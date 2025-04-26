import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[][] paper;
    static int whiteCnt = 0; // 하얀색 색종이 개수, 0
    static int blueCnt = 0; // 파란색 색종이 개수, 1
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());

        paper = new int[N][N];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Quad(0, 0, N);

        bw.write(String.valueOf(whiteCnt)+"\n");
        bw.write(String.valueOf(blueCnt));
        bw.flush();
        bw.close();
    }
    private static void Quad(int r, int c, int size){
        if(check(r, c, size)){
            if(paper[r][c]==0){
                whiteCnt++;
            } else if(paper[r][c]==1){
                blueCnt++;
            }
            return;
        }
        /*
        [0] [1]
        [2] [3]
         */
        int newSize = size/2;
        Quad(r, c, newSize); // [0]
        Quad(r, c + newSize, newSize); // [1]

        Quad(r+newSize, c, newSize); // [2]
        Quad(r+newSize, c+newSize, newSize); // [3]
    }
    private static boolean check(int r, int c, int size){
        int color = paper[r][c];
        for(int i=r; i<r+size; i++){
            for(int j=c; j<c+size; j++){
                if(paper[i][j] != color){
                    return false;
                }
            }
        }
        return true;
    }
}