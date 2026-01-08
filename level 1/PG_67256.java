class PG_67256 {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int[][] board = {
                {3, 1},
                {0, 0}, {0, 1}, {0, 2},
                {1, 0}, {1, 1}, {1, 2},
                {2, 0}, {2, 1}, {2, 2},
                {3, 0}, {3, 2}
        };
        int left=10; int right=11;

        for(int num : numbers){
            if(num==1 || num==4 || num==7){
                sb.append("L");
                left = num;
            } else if(num==3 || num==6 || num==9){
                sb.append("R");
                right = num;
            } else{
                int dL = Math.abs(board[left][0] - board[num][0]) + Math.abs(board[left][1] - board[num][1]);
                int dR = Math.abs(board[right][0] - board[num][0]) + Math.abs(board[right][1] - board[num][1]);

                String choice = (dL==dR) ? (hand.equals("left") ? "L" : "R") : (dL < dR ? "L" : "R");
                sb.append(choice);

                if(choice.equals("L")) left = num;
                else right = num;
            }
        }
        return sb.toString();
    }
}