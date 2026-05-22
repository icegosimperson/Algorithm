class PG_181867 {
    public int[] solution(String myString) {
        String[] split = myString.split("x", -1);
        int[] answer = new int[split.length];
        for(int i=0; i<split.length; i++){
            answer[i] = split[i].length();
        }
        return answer;
    }
}