class Solution {
    public boolean canPartition(int[] nums) {
        
        int sum=0;
        
        for(int i=0; i<nums.length;i++)
        {
            sum=sum+nums[i];
        }
        
        if(sum%2==1){
            return false;
        }
        
        Boolean storage[][]=new Boolean[nums.length+1][(sum/2)+1];
        
        return canPartitionm(nums,0,sum/2,storage);
    }
     public boolean canPartitionm(int[] nums, int i, int sum, Boolean storage[][]){
         
       if(sum==0)
            return true;
		if(i>=nums.length || sum<0)
            return false;
         
        if(storage[i][sum]!=null)
            return storage[i][sum];
         
         
        return storage[i][sum]=(canPartitionm(nums,i+1,sum-nums[i],storage) || canPartitionm(nums,i+1,sum,storage));
    }
}