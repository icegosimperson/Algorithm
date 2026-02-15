import java.io.*;
import java.util.StringTokenizer;

class BOJ_1547{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int temp = 1;

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());
            if(X==temp){
                temp = Y;
            } else if(Y== temp){
                temp = X;
            }
        }
        System.out.println(temp);
    }
}