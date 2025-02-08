import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BOJ_1475{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        int[] arr = new int[10];

        for(int i=0; i<N.length(); i++){
            int n = Character.getNumericValue(N.charAt(i));
            if(n==6 || n==9){
                arr[6]++;
            } else arr[n]++;
        }
        // 6과 9는 서로 대체 가능하므로 합쳐서 계산
        arr[6] = (arr[6] + 1) / 2; // 올림 처리

        int max = 0;
        for(int i=0; i<10; i++){
            max = Math.max(max, arr[i]);
        }
        System.out.println(max);
    }
}