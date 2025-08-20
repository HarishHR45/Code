class Solution {
    public int removeElement(int[] nums, int val) {
        int start = 0;
        for(int i = 0;i < nums.length; i++){
            if(val != nums[i]){
                nums[start] = nums[i];
                start++;
            }
        }
        return start;
    }
}