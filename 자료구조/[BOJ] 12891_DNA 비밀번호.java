import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int myArr[]; // 여러 함수에서 사용하기 위해전역 변수로 선언
    static int checkArr[]; // 여러 함수에서 사용하기 위해전역 변수로 선언
    static int checkSecret;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken()); // 문자열 크기
        int P = Integer.parseInt(st.nextToken()); // 부분 문자열의 크기
        int result = 0; // 정답값

        checkArr = new int[4]; // 비밀번호 체크 배열
        myArr = new int[4]; // 현재 상태 배열
        char A[]; // 문자열 데이터 배열
        checkSecret = 0; // 4개다 만족하면 count++

        A = br.readLine().toCharArray(); // 입력받은 문자열을 바로 문자 배열로 변환

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<4; i++){
            checkArr[i] = Integer.parseInt(st.nextToken()); // 비밀번호 조건 입력 받음
            if(checkArr[i] == 0){ // 비밀번호 조건이 0인 문자열일 경우
                checkSecret++; // 이미 만족됐다는 의미 -> 충족 여부++
            }
        }

        for(int i=0; i<P; i++){ // 초기 부분문자열 초기화
            Add(A[i]);
        }

        if(checkSecret == 4) result++;

        for(int i=P; i<S; i++){ // 슬라이딩 윈도우 한 상태
            int j = i-P; // j : 삭제하는 문자 인덱스, i : 현재 추가하는 문자 인덱스
            Add(A[i]); // 윈도우 오른쪽에 새로운 문자를 추가
            Remove(A[j]); // 윈도우 왼쪽에 제거되는 문자를 삭제
            if(checkSecret == 4) result++; // DNA 문자열 만족시 결과 출력
        }
        System.out.println(result);
        br.close();
    }

    private static void Add(char c){
        switch (c){
            case 'A':
                myArr[0]++;
                if(myArr[0] == checkArr[0]) checkSecret++;
                break;
            case 'C':
                myArr[1]++;
                if(myArr[1] == checkArr[1]) checkSecret++;
                break;
            case 'G':
                myArr[2]++;
                if(myArr[2] == checkArr[2]) checkSecret++;
                break;
            case 'T':
                myArr[3]++;
                if(myArr[3] == checkArr[3]) checkSecret++;
                break;
        }
    }
    private static void Remove(char c){
        switch (c){
            case 'A':
                if(myArr[0] == checkArr[0]) checkSecret--;
                myArr[0]--;
                break;
            case 'C':
                if(myArr[1] == checkArr[1]) checkSecret--;
                myArr[1]--;
                break;
            case 'G':
                if(myArr[2] == checkArr[2]) checkSecret--;
                myArr[2]--;
                break;
            case 'T':
                if(myArr[3] == checkArr[3]) checkSecret--;
                myArr[3]--;
                break;
        }
    }
}


