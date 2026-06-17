class StackQ1_Build an Array With Stack Operations {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> list = new ArrayList<>();
        int num = 1;
        int idx = 0;
        boolean flag = true;
        while(flag){
            if(target[target.length-1]==num) flag = false;
            if(target[idx]==num){
                list.add("Push");
                idx++;
            } else{
                list.add("Push");
                list.add("Pop");
            }
            num++;
        }
        return list;
    }
}