/*
문자열 9개를 입력 받고 // 입력받는 숫자가 정해져있으니 배열 개수 9로 설정
최대값을 찾아서 출력  // 임의로 최대값을 arr[0]으로 설정하고 정수 크기 비교 시작 
이 최대값이 몇번째 인지 출력 // 배열은 0번째부터 시작이니, i+1
*/

import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] arr = new int[9];
    int max=arr[0];
    int count=0;
    
    // 입력 받은 숫자 만큼 배열에 저장 
    for(int i=0; i<arr.length; i++){
      arr[i] = sc.nextInt();
    }
    
    
    for(int i=0; i<arr.length; i++){
      if(max<arr[i]){ // 숫자를 저장
        max = arr[i];
        count = i+1;
      }
    }
    
    System.out.printf("%d\n%d", max, count);

  }
}
