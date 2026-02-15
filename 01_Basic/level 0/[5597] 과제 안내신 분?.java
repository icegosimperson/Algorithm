import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[28];
    boolean[] answer = new boolean[31];
    
    for(int i=0; i<arr.length; i++){
      arr[i] = sc.nextInt();
    }

    for(int i=0; i<arr.length; i++){
      answer[arr[i]] = true;
    }
    
    for(int i=1; i<30; i++){
      if(!answer[i]){
        System.out.println(i);
      }
    }
  }
}

/*
* Java에서는 배열의 원소로 다른 배열을 사용할 수 있다



answer[arr[i]]에서 arr[i]는 arr 배열의 i번째 원소의 값을 의미하며, 이 값은 answer 배열의 인덱스로 사용

간단한 예를 들어보겠습니다.


int[] indices = {2, 4, 7};
boolean[] flags = new boolean[10];

- indices 배열에는 2, 4, 7값 저장 

- flags 배열은 길이가 10인 boolean 배열

이제 indices 배열의 각 원소를 사용하여 flags 배열의 특정 위치에 접근하고 값을 변경 가능


for (int i = 0; i < indices.length; i++) {
    flags[indices[i]] = true;
}

이 코드를 실행한 후 flags 배열을 확인하면 flags[2], flags[4], flags[7] 위치의 값들이 true로 설정됨
이처럼 배열의 특정 원소의 값을 다른 배열의 인덱스로 사용할 수 있습니다.


*/
