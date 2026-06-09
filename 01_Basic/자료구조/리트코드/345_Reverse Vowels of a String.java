// [a, e, i, o, u]면 그 부분만 reverse
// 대문자, 소문자 케이스 모두 포함
// 아스키코드 이용 (대소문자 차이) 소문자a(97) - 대문자(A)65 = 32 lowerCase
// -32면 UpperCase
class 345_Reverse Vowels of a String {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        StringBuilder rb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='a' || c=='A' || c=='e' || c=='E'|| c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U'){
                rb.append(c);
            } else continue;
        }
        String reverse = rb.reverse().toString();
        int idx = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='a' || c=='A' || c=='e' || c=='E'|| c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U'){
                sb.replace(i, i+1, reverse.charAt(idx++)+ ""); // sb.setCharAt(i, rb.charAt(rbIdx--));
            }
        }
        return sb.toString();
    }
}
/*

*/
 */
/*
class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray(); // 수정이 편하도록 char 배열로 변환
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // 왼쪽 포인터가 모음을 만날 때까지 이동
            while (left < right && !isVowel(arr[left])) {
                left++;
            }
            // 오른쪽 포인터가 모음을 만날 때까지 이동
            while (left < right && !isVowel(arr[right])) {
                right--;
            }

            // 둘 다 모음 위치에 도달했다면 스왑(Swap)
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // 다음 칸으로 이동
            left++;
            right--;
        }

        return new String(arr);
    }

    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
 */