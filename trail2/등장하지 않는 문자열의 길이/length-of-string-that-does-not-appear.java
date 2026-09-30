import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        for(int k=1; k<=n; k++){
            boolean isValid = true;
            HashSet<String> set = new HashSet<>();
            for(int i=0; i<n-k+1; i++){
                String sub = str.substring(i, i+k);
                if(set.contains(sub)){
                    isValid = false;
                    break;
                }
                set.add(sub);
            }
            if(isValid){
                System.out.println(k);
                return;
            }
        }
    }
}