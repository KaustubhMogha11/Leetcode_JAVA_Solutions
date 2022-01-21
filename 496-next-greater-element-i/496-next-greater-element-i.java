class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       int[] ans = new int[nums1.length];
        int i, j, min;
        for(i=0;i<nums1.length;i++) {
            for(j=0;j<nums2.length;j++) {
                if(nums1[i] == nums2[j]) {
                    break;
                }
            }
            min = Integer.MAX_VALUE;
            while(j<nums2.length) {
                if(nums2[j] > nums1[i]) {
                    min = nums2[j];
                    break;
                }
                j++;
            }
            if(min == Integer.MAX_VALUE) min = -1;
            ans[i] = min;
        }
        return ans;
        
    }
}