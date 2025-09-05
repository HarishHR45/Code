class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int s = m;
        for(int e = 0; e < n ; e++){
            nums1[s] = nums2[e];
            s++;
        }
        Arrays.sort(nums1);
    }
}