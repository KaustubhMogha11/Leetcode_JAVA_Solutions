class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    
    
        int m=nums1.length;
        int n=nums2.length;
            if(m>n)
        return findMedianSortedArrays(nums2,nums1);
        
        
        int s=0,e=m,medianpos=((m+n)+1)/2;
        
        while(s<=e)
        {
            int cut1=(s+e)>>1;
            int cut2=medianpos-cut1;
            
            int l1=(cut1==0)? Integer.MIN_VALUE:nums1[cut1-1];
            int l2=(cut2==0)? Integer.MIN_VALUE:nums2[cut2-1];
            int r1 = (cut1 == m)? Integer.MAX_VALUE:nums1[cut1];
        int r2 = (cut2 == n)? Integer.MAX_VALUE:nums2[cut2];
            
         
        if(l1<=r2 && l2<=r1) {
            if((m+n)%2 != 0)
                return Math.max(l1,l2);
            else 
                return (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
        }
        else if(l1>r2) e= cut1-1;
        else s= cut1+1;
    }
    return 0.0;
}
    }
