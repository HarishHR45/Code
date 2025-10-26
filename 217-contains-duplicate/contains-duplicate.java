class Solution {
    public boolean containsDuplicate(int[] nums) {
        /*for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i != j){
                    if(nums[i] == nums[j]){
                    return true;
                  }
                }
            }
        }
        return false;*/
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
            else{
                return true;
            }
        }
        return false;
    }
}