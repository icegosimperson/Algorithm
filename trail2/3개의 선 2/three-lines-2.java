import java.util.Scanner;
import java.util.*;

public class Main {
    static int n;
    static int[] x;
    static int[] y;
    static List<Integer> xList = new ArrayList<>();
    static List<Integer> yList = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        x = new int[n];
        y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        if(dfs(0)){
            System.out.println(1);
        } else{
            System.out.println(0);
        }
    }
    public static boolean dfs(int used){
        int idx = -1;
        for(int i=0; i<n; i++){
            if(!xList.contains(x[i]) && !yList.contains(y[i])){
                idx = i;
                break;
            }
        }
        if(idx==-1){
            return true;
        }
        if(used==3){
            return false;
        }
        xList.add(x[idx]);
        if(dfs(used+1)){
            xList.remove(xList.size()-1);
            return true;
        }
        xList.remove(xList.size()-1);
        yList.add(y[idx]);
        if(dfs(used+1)){
            yList.remove(yList.size()-1);
            return true;
        }
        yList.remove(yList.size()-1);
        return false;
    }
}