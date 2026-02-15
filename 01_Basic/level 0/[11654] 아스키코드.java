import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 아스키코드 : 문자열 -> 숫자 변환 
    String input = sc.next();
    char output = input.charAt(0); // 0번째 문자열이 반환 되도록
    
    System.out.println((int)output);
  
  }
}

/*
아스키코드란?
ASCII는 American Standard Code for Information Interchange의 약자로, 정보 교환을 위한 미국 표준 코드입니다. 이것은 각 문자와 숫자를 7비트의 이진 숫자로 매핑하는 것을 의미합니다. 예를 들어, 대문자 'A'는 아스키코드에서 65로 표현되며, 'B'는 66으로 표현됩니다.

Java에서 문자를 숫자로 변환하기
Java에서 char 데이터 타입은 내부적으로 16비트 유니코드 값을 사용하여 문자를 표현합니다. 아스키 코드는 유니코드의 하위 집합으로 간주될 수 있습니다. 따라서, Java에서 아스키 문자를 사용할 때, 이 문자의 아스키 값은 그대로 해당 문자의 char 값으로 사용됩니다.

프로그램의 코드에서 output 변수는 input 문자열의 첫 번째 문자를 포함하고 있습니다. 그리고 이 코드 부분:

java
Copy code
System.out.println((int)output);
에서, output의 char 값을 int 타입으로 캐스팅하여 해당 문자의 아스키 코드 값을 출력하고 있습니다.

예를 들어, 사용자가 'A'를 입력하면, output에는 'A'가 저장되고, 이 'A'의 아스키 값인 65가 출력됩니다.

요약하면, 문자는 내부적으로 숫자로 표현되며, Java에서는 이러한 내부 표현을 직접 액세스하거나 변환하는 기능을 제공하여 아스키 코드와 같은 값을 얻을 수 있습니다.
*/
