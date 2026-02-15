/*
s = aukks
skip = wbqd
index = 5

aukks을 5만큼 뒤의 알파벳으로 바꿔줌
5만큼 뒤에 z -> a (순회)
skip 제외

a -> c e f g h=> h

s 문자열 길이 만큼 반복
charAt + index
skip에 해당하는 문자인지 확인 "wbqd"
*/

class PG_155652 {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++){ // 5번 반복 
            char cur = s.charAt(i);
            int cnt = 0; // 이동 횟수
            while(cnt < index){
                cur++;
                if(cur > 'z'){
                    cur = 'a';
                }
                if(skip.indexOf(cur)==-1){
                    cnt++;
                }
            }
            sb.append(cur);
        }
        return sb.toString();
    }
}

/*
        for (char letter : s.toCharArray()) {
            char temp = letter;
            int idx = 0;
            while (idx < index) {
                temp = temp == 'z' ? 'a' : (char) (temp + 1);
                if (!skip.contains(String.valueOf(temp))) {
                    idx += 1;
                }
            }
            answer.append(temp);
        }

        return answer.toString();
*/