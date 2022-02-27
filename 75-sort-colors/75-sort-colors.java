class Solution {
    public void sortColors(int[] nums) {
//        int j=0;
//      for(int i=0; i<nums.length;i++){
//          while( j>=i){
//              if(nums[i]>nums[j]){
//                  int temp=nums[i];
//                  nums[i]=nums[j];
//                  nums[j]=temp;
//                  j--;
//              }
                 
             
//          }
//      }
        
        int count1=0;
        int count2=0;
        int count3=0;
        
        for(int i=0; i<nums.length;i++){
            if(nums[i]==0)
                count1++;
             if(nums[i]==1)
                count2++;
             if(nums[i]==2)
                count3++;
            
        }
         int i=0;
        while (count1 > 0) { 
        nums[i++] = 0; 
        count1--; 
    } 
        while (count2 > 0) { 
        nums[i++] = 1; 
        count2--; 
    } 
       
        while (count3 > 0) { 
        nums[i++] = 2; 
        count3--; 
    }  
     
    }
}