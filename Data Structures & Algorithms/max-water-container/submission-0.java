class Solution {
    public int maxArea(int[] heights) {
        int max=0;
        int left=0;
        int right=heights.length-1;
        while(left<right){
            int width=Math.min(heights[left],heights[right]);
            int length=right-left;
            max=Math.max(max,width*length);
            if(heights[left]<heights[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
}
