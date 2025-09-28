class Solution {
    public int singleNumber(int[] nums) {
        /*
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue().equals(1)){
                return entry.getKey();
            }
        }
        return -1;*/
        int ans = 0;
        for(int n : nums){
            ans = ans ^ n;
        }
        return ans;
    }
}