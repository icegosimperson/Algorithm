class PG_카펫 {
    public int[] solution(int brown, int yellow) {
        int area = brown + yellow;
        for(int h=3; h<=Math.sqrt(area); h++){
            if(area%h==0){
                int w = area/h;
                if((w-2)*(h-2)==yellow){
                    return new int[]{w, h};
                }
            }
        }
        return new int[]{0, 0};
    }
}