class PG_181881 {
    public int solution(int[] arr) {
        int x = 0;
        while(true){
            boolean flag = false;
            int[] next = new int[arr.length];
            for(int i=0; i<arr.length; i++){
                if(arr[i] > 50 && arr[i]%2==0){
                    next[i] = arr[i] / 2;
                    flag = true;
                } else if(arr[i] < 50 && arr[i]%2==1){
                    next[i] = arr[i] * 2 + 1;
                    flag = true;
                } else{
                    next[i] = arr[i];
                }
            }
            if(!flag) return x;
            arr = next;
            x++;
        }
    }
}