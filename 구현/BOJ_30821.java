import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
정N각형의 꼭짓점을 이어 만들 수 있는 서로 다르별의 개수를 출력
nC5 계산 구현 하기
 */
class BOJ_30821{
    private static int combination(int n, int r){
        if(n==r || r==0){
            return 1;
        }
        else return combination(n-1, r-1) + combination(n-1, r);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 꼭짓점의 개수

        System.out.println(combination(N, 5));
    }
}


