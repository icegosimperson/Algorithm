class R2_카펫 {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;
        for(int h=1; h<=total; h++){
            if(total%h == 0){
                int w = (total/h);
                if((w-2)*(h-2)==yellow){
                    if(w>=h){
                        return new int[]{w, h};
                    }
                }
            }
        }
        // brown + yellow = 총 넓이
        return new int[]{0, 0}; // 전체 카펫의 가로, 세로 크기
    }
}