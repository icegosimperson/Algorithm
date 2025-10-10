class PG_12916 {
    boolean solution(String s) {
        s = s.toLowerCase();
        int cnt = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='p'){
                cnt++;
            } else if(s.charAt(i)=='y'){
                cnt--;
            }
        }

        if(cnt==0){
            return true;
        } else{
            return false;
        }
    }
}
/*
class PG_12916 {
    boolean solution(String s) {
        int pCnt = 0, yCnt=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='p' || s.charAt(i)=='P') pCnt++;
            else if(s.charAt(i)=='y' || s.charAt(i)=='Y') yCnt++;
        }

        if(pCnt == yCnt || (pCnt==0 && yCnt==0)){
            return true;
        } else if(pCnt != yCnt) {
            return false;
        }
        return true;
    }
}
 */