class 1431_Kids With the Greatest Number of Candies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int c : candies){
            max = Math.max(c, max);
        }
        for(int c : candies){
            int temp = c + extraCandies;
            if(temp>=max){
                list.add(true);
            } else{
                list.add(false);
            }
        }
        return list;
    }
}