class PG_87390 {
    public int[] solution(int n, long left, long right) {
        int size = (int)(right-left+1);
        int[] answer = new int[size];
        for(int i=0; i<size; i++){
            long k = left+i;
            long row = k/n;
            long col = k%n;
            int max = (int)Math.max(row, col);
            answer[i] = max+1;
        }
        return answer;
    }
}