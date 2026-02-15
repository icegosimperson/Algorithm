import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(NextProblemNumber(N));
    }

    public static int NextProblemNumber(int N){
        char[] numbers = Integer.toString(N).toCharArray();
        int length = numbers.length;

        int i = length -2;
        while(i>=0 && numbers[i] >= numbers[i+1]){
            i--;
        }

        if(i== -1){
            return -1;
        }

        int j = length -1;
        while(numbers[j] <= numbers[i]){
            j--;
        }

        char temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;

        Arrays.sort(numbers, i+1, length);

        return Integer.parseInt(new String(numbers));
    }
}
