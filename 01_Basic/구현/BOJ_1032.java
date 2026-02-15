import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BOJ_1032{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 문자열의 길이 N
        String[] arr = new String[N];
        for(int i=0; i<N; i++) {
            arr[i] = br.readLine();
        }
        char[] ccc = arr[0].toCharArray();
        for(int i=0; i<arr[0].length(); i++){
            char cur = arr[0].charAt(i);
            for(int j=1; j<N; j++){
                if(arr[j].charAt(i) != cur){
                    ccc[i] = '?';
                    break;
                }
            }
        }
        System.out.println(new String(ccc));
    }
}