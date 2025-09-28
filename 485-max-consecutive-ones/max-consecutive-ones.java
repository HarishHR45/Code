class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0,count = 0,left=0;
        while(left < nums.length) {
            if(nums[left] == 1){
                left++;
                count++;
                max = Math.max(max,count);
            }
            else{
                count=0;
                left++;
            }
        }
        return max;
    }
}