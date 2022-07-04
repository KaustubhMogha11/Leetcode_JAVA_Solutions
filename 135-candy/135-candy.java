class Solution {
    public int candy(int[] ratings) {
        
        int right[]=new int[ratings.length];
        int left[]=new int[ratings.length];
        
        Arrays.fill(right,1);
        Arrays.fill(left,1);
        
        for(int i=1;i<left.length;i++)
        {
            if(ratings[i]>ratings[i-1])
            {
                left[i]=left[i-1]+1;
            }
        }
         for(int i=right.length-2;i>=0;i--)
        {
            if(ratings[i]>ratings[i+1])
            {
                right[i]=right[i+1]+1;
            }
        }
        int ans=0;
         for(int i=0;i<left.length;i++)
        {
           ans=Math.max(left[i],right[i])+ans;
        }
        
        return ans;
    }
}