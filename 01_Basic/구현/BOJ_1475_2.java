import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 방번호가 주어졌을 때 필요한 세트의 개수의 최솟값
class BOJ_1475_2{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10]; // 0~9 숫자 하나씩 저장하는 배열
        String N = br.readLine(); // 길이만큼 반복하기 위해 String으로 입력 받음

        for(int i=0; i<N.length();i++){
            int n = N.charAt(i)-'0';
            if(n==6 || n==9){
                arr[6]++;
            } else arr[n]++;
        }

        arr[6] = (arr[6]+1)/2; // 홀수 일 때 고려해서 올림처리 필요

        int max = 0;
        for(int i=0; i<arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        System.out.println(max);

    }
}

/*
            arr[N.charAt(i)]++;
            if(N.charAt(i)== arr[6] || N.charAt(i)==arr[9]){ // 6 <-> 9
                arr[6]++;
            } else arr[N.charAt(i)]++;
 */