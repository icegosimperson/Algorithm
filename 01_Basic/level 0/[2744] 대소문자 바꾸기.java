import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();

    for(int i=0; i<str.length(); i++){
      char c = str.charAt(i); // 문자열을 한글자씩 쪼갬
      if(Character.isUpperCase(c)) // 대문자 -> 소문자
          c = Character.toLowerCase(c);
      else // 소문자 -> 대문자 
        c = Character.toUpperCase(c);
      System.out.print(c); // 변환된 문자를 출력 
    }
  }
}
