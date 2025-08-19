class Solution {
    public int search(int[] nums, int target) {
        int left = 0 , right = nums.length-1;
        while(left <= right){
            int mid = left + ((right - left)/2);
            int val = nums[mid];
            if(val == target){
                return mid;
            }
            else if(target > val){
                left = mid+1;
            }
            else{
                right = mid -1 ;
            }
        }
        return -1;
    }
}