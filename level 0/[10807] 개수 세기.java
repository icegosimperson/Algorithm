import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
	int[] input = new int[N];
    
    for(int i=0; i<N; i++) 
        input[i] = sc.nextInt();
    
    int v = sc.nextInt();
    int count=0;
    
    for(int i=0; i<N; i++) {
    	if(input[i]==v)
    		count++;
    }
    System.out.println(count);

    
	sc.close();
  }
}
  
