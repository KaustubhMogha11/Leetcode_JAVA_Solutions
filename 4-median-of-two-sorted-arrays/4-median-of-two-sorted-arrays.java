class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
       int m=nums1.length;
        int n=nums2.length;
        
            int finalArray[]=new int[n+m];
    int i=0,j=0,k=0;
    while(i<m && j<n) {
        if(nums1[i]<nums2[j]) {
            finalArray[k++] = nums1[i++];
        }
        else {
            finalArray[k++] = nums2[j++];
        }
    }
    if(i<m) {
        while(i<m) 
            finalArray[k++] = nums1[i++];
    }
    if(j<n) {
        while(j<n)
            finalArray[k++] = nums2[j++];
    }
    n = n+m;
    if(n%2==1) 
        return finalArray[((n+1)/2)-1];
    else return ((double)finalArray[(n/2)-1]+(double)finalArray[(n/2)])/2.0;
}
    }
