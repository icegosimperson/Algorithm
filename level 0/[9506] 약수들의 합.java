import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        while(true){
            int n = Integer.parseInt(br.readLine());
            
            if(n == -1) // 종료 조건 : -1
                break;
            
            int sum = 0; // 합 변수 선언
            int arr[] = new int[n]; // 약수를 저장할 배열 생성
            
            // 완전수 판단
            for(int i=1; i<=n; i++){
                if(n%i==0 && n!= i){
                    arr[i-1] = i; // 배열에 약수 저장
                    sum += i; // 합계 구함
                }
            }
            
            // 완전수가 아니라면
            if(sum!= n){
                sb.append(n + " is NOT perfect. \n");
                continue; // 반복문 탈출
            }
           
            // 완전수 일 경우 출력
            sb.append(n + " = 1"); // 1은 모든 수의 약수
            
            for(int i=0; i<n; i++){
                if(arr[i] !=0 && arr[i] !=1)
                    sb.append(" + " + arr[i]);
            }
            sb.append("\n");    
        }
        
        bw.write(sb.toString()); // sb.append 출력
        bw.flush();
        br.close();
        bw.close();
    }
}
