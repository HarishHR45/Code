class Solution {
    public int[] leftRightDifference(int[] nums) {
        int leftsum[] = new int[nums.length];
        int rightsum[] = new int[nums.length];
        int result[] = new int[nums.length];
        leftsum[0] = 0;
        for(int i = 1;i < nums.length;i++){
            int left = leftsum[i-1]+nums[i-1];
            leftsum[i] = left;
        }
        rightsum[nums.length-1] = 0;
        for(int i = nums.length - 2;i >= 0;i--){
            int right = rightsum[i+1]+nums[i+1];
            rightsum[i] = right;
        }
        for(int i=0;i<nums.length;i++){
            result[i] = Math.abs(leftsum[i]-rightsum[i]);
        }
        return result;
    }
}