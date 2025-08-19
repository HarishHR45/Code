class Solution {
    public int removeDuplicates(int[] nums) {
        int start = 1;
        for(int i = start; i<nums.length; i++){
            if(nums[i] != nums[start-1]){
                nums[start] = nums[i];
                start++;
            }
        }
        return start;
    }
}