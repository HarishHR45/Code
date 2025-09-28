class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int len = nums1.length < nums2.length ? nums1.length : nums2.length;
        Set<Integer> set = new HashSet<>();
        int num1index = 0,num2index  = 0,resindex = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(num1index < nums1.length && num2index < nums2.length){
            if(nums1[num1index] == nums2[num2index]){
                set.add(nums1[num1index]);
                num1index++;
                num2index++;
            }
            else if(nums1[num1index] < nums2[num2index]){
                num1index++;
            }
            else if(nums2[num2index] < nums1[num1index]){
                num2index++;
            }
        }
        Integer[] resf = set.toArray(new Integer[0]);
        int[] res = new int[resf.length];
        for(int i=0;i<resf.length;i++){
            res[i] = resf[i];
        }
        return res;
    }
}