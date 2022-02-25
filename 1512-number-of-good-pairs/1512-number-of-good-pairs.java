class Solution {
    public int numIdenticalPairs(int[] nums) {
     
//         int count=0;
//         for(int i=0; i<nums.length;i++){
//             for(int j=i;j<nums.length;j++){
//                 if(nums[i]==nums[j] && i!=j)
//                 {
//                     count++;
//                 }
//             }
//         }
        
//         return count;
        
        int count=0;
        HashMap<Integer, Integer> map=new  HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],0);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
                count=count+map.get(nums[i]);
            }
        }
        
        return count;
    }
}