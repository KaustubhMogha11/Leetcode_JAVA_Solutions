class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        
//         int i=0;
//         int j=0;
//         int sum=0;
//         int ans=0;
//         HashMap<Integer,Integer> map=new HashMap<>();
//         while(j<nums.length)
//         {
//             if(map.containsKey(nums[j]))
//             {
//                 map.put(nums[j],map.get(nums[j])+1);
//             }else
//             {
//                 map.put(nums[j],1);
//             }
//             sum=sum+nums[j];
            
//             if(map.size()==j-i+1){
//                 ans=Math.max(ans,sum);
//             } else {
//                 while(map.size()!=j-i+1){
//                     map.replace(nums[i], map.get(nums[i])-1);
//                     if(map.get(nums[i])==0){
//                         map.remove(nums[i]);
//                     }
//                     sum-=nums[i];
//                     i++;
//                 }
                
//                 ans = Math.max(ans, sum);
//             }
            
//             j++;
            
            
//         }
        
//         return ans;
        
        int i=0;
        int j=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int ans=0;
        while(j<nums.length)
        {
            sum=sum+nums[j];
            if(map.containsKey(nums[j]))
            {
                map.put(nums[j],map.get(nums[j])+1);
            }else{
            map.put(nums[j],1);
            }
            if(map.size()==j-i+1)
            {
                ans=Math.max(ans,sum);
            }else{
               while(map.size()!=j-i+1){
                    map.replace(nums[i], map.get(nums[i])-1);
                    if(map.get(nums[i])==0){
                        map.remove(nums[i]);
                    }
                    sum-=nums[i];
                    i++;
                }
                
                ans = Math.max(ans, sum);
            }
            
            j++;
        }
        
        return ans;
    }
}