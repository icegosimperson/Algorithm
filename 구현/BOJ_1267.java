import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
Y : 30초마다 10원씩 청구 (29초 이하 10원)
M : 60초마다 15원씩 청구 (59초이하 15원)

배열도 필요 없었음
*/

class BOJ_1267{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int Ysum = 0, Msum=0;
        for(int i=0; i<N; i++){
            int second = Integer.parseInt(st.nextToken());
            Ysum += 10 * (second/30+1); // +1을 하여 30초 이하 통화 요금 계산
            Msum += 15 *(second/60+1) ;
        }
        if(Ysum < Msum){
            System.out.println('Y' + " " + Ysum);
        } else if(Ysum > Msum){
            System.out.println('M' + " " + Msum);
        } else{
            System.out.println("Y M" + " "+ Ysum);
        }

    }
}