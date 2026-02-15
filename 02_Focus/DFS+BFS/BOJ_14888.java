import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
식의 결과의 최댓값
최솟값
 */
class Main {
    private static int[] number;
    private static int[] operator = new int[4];
    private static int N;
    private static int max = Integer.MIN_VALUE;
    private static int min = Integer.MAX_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());

        number = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N;i++){
            number[i] = Integer.parseInt(st.nextToken());
        }

        // +, -, x, /
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<4; i++){
            operator[i] = Integer.parseInt(st.nextToken());
        }
        dfs(number[0], 1);

        System.out.println(max);
        System.out.println(min);
    }
    private static void dfs(int num, int depth){
        if(depth==N){
            max = Math.max(max, num);
            min = Math.min(min, num);
            return;
        }
        for(int i=0; i<4; i++){
            if(0< operator[i]){ // 연산자 개수가 한개 이상인 경우
                operator[i]--;
                switch (i){
                    case 0:
                        dfs(num + number[depth], depth+1);
                        break;
                    case 1:
                        dfs(num-number[depth], depth+1);
                        break;
                    case 2:
                        dfs(num*number[depth],depth+1);
                        break;
                        case 3:
                        dfs(num/number[depth], depth+1);
                        break;
                }
                operator[i]++;
            }
        }
    }
}



