class PG_12918 {
    public boolean solution(String s) {
        boolean answer = true;
        if(4 == s.length() || s.length() ==6){
            char[] c = s.toCharArray();
            for(int i=0; i<s.length(); i++){
                if(48 <= c[i] && c[i] <=57){ // 0~9
                    continue;
                } else{
                    answer = false;
                    break;
                }
            }
        }
        else return false;
        return answer;
    }
}

/*
class Solution {
  public boolean solution(String s) {
      if(s.length() == 4 || s.length() == 6){
          try{
              int x = Integer.parseInt(s);
              return true;
          } catch(NumberFormatException e){
              return false;
          }
      }
      else return false;
  }
}


*/