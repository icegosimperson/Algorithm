import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
Y : 30초마다 10원씩 청구 (29초 이하 10원)
M : 60초마다 15원씩 청구 (59초이하 15원)

배열도 필요 없었음
*/

class BOJ_10804{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] arr = new int[21];
        for(int i=1; i<=20; i++){
            arr[i] = i;
        }

        int t = 10;
        while(t-->0){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()); // ai
            int b = Integer.parseInt(st.nextToken()); // bi
//            for(int i=b; i>a; i--){
//                int temp = arr[i];
//                arr[i] = arr[i-a];
//                arr[i-a] = temp;
//            }
            for(int i=0; i<(b-a+1)/2; i++){ // 배열의 양 끝을 좁혀가며 교환 arr[a+i] <-> arr[b-i]
                int temp = arr[a+i];
                arr[a+i] = arr[b-i];
                arr[b-i] = temp;
            }
        }
        for(int i=1; i<=20; i++){
            System.out.print(arr[i] + " ");
        }
    }
}