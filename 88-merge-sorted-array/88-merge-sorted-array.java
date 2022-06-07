class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        for(int i=0;i<nums2.length;i++)
        {
            nums1[m+i]=nums2[i];
        }
        
        Arrays.sort(nums1);
        
        // return nums1;
    }
}