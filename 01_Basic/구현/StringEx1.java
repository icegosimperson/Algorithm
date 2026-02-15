import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] dic = {" "};
       List<String> answer = new ArrayList<>(); 

        for(int i=0; i<dic.length; i++){
            for(int j=0; j<dic.length; j++){
                if(i!=j){
                    String word1 = dic[i];
                    String word2 = dic[j];
                    int length = (word1.length() < word2.length()) ? word1.length() : word2.length();

                    String connect = word1 + word2;
                    for(int k=1; k<=length; k++){
                        if (word1.substring(word1.length() - k).equals(word2.substring(0, k))) { 
                            connect = word1 + word2.substring(k);
                            break;
                        }
                    }
                    boolean visited = false;
                    for(int k=0; k<dic.length; k++){
                        if(dic[i].equals(connect)){
                            visited = true;
                            break;
                        }
                    }
                    if(visited && ! answer.contains(connect)){
                        answer.add(connect);
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
