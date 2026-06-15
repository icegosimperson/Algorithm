/*
그리디
용기에 담을 수 있는 최대 물의 양 반환
*/
class 11_Container With Most Water {
    public int maxArea(int[] height) {
        int area = Integer.MIN_VALUE;
        int start = 0;
        int end = height.length-1;
        while(start < end){
            int h = Math.min(height[start], height[end]);
            int w = end - start;
            area = Math.max(h*w, area);
            if(height[start]<height[end]){
                start++;
            } else{
                end--;
            }
        }
        return area;
    }
}