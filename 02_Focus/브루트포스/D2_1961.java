import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
3 2 1
6 5 4
9 8 7
 */
class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        int tc = 1;
        while(T-->0){
            int N = Integer.parseInt(br.readLine());
            int[][] arr = new int[N][N];
            for(int i=0; i<N; i++){
                st = new StringTokenizer(br.readLine());
                for(int j=0; j<N; j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            int[][] arr90 = rotate(arr);
            int[][] arr180 = rotate(arr90);
            int[][] arr360 = rotate(arr180);

            System.out.println("#"+ tc);

            for(int i=0; i<arr.length; i++){
                for(int j=0; j<arr.length; j++){
                    System.out.print(arr90[i][j]);
                }
                System.out.print(" ");

                for(int j=0; j<arr.length; j++){
                    System.out.print(arr180[i][j]);
                }
                System.out.print(" ");

                for(int j=0; j<arr.length; j++){
                    System.out.print(arr360[i][j]);
                }
                System.out.println();
            }
            tc++;
        }
    }
    private static int[][] rotate(int[][] arr){
        int[][] copyBoard = new int[arr.length][arr.length];

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                copyBoard[i][j] = arr[arr.length-1-j][i];
            }
        }
        return copyBoard;
    }
}
