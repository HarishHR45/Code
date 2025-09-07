class Solution {
    public int maxArea(int[] height) {
        int res = Integer.MIN_VALUE;
        int c = 0, left = 0, right = height.length - 1;
        while(left < right){
            if(height[left] < height[right]){
                c = height[left] * (right - left);
                res = Math.max(res,c);
                left++;
            }
            else{
                c = height[right] * (right - left);
                res = Math.max(res,c);
                right--;
            }
        } 
        return res;
    }
}