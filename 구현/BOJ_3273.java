import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
a+b = x 것을 찾고 싶으면
b = x-a인 숫자가 이미 앞에서 등장했는지 확인
 */
class BOJ_3273{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine()); // 수열의 크기
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int target = Integer.parseInt(br.readLine());
        int cnt = 0;
        boolean[] check = new boolean[2000001];
        for(int i=0; i<n; i++){
            if(target-arr[i] >=0 && check[target-arr[i]]) {
                cnt++;
            }
            check[arr[i]]=true;
        }
        System.out.println(cnt);
    }
}


/*
        int n = Integer.parseInt(br.readLine()); // 수열의 크기
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int ans = Integer.parseInt(br.readLine());
        int cnt = 0;
        Arrays.sort(arr);
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(arr[i]+arr[j]==ans){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);

 */