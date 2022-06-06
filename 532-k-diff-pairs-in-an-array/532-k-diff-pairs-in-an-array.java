class Solution {
    public int findPairs(int[] nums, int k) {
          if (nums == null || nums.length == 0 || k < 0){
            return 0;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        for(int val: map.keySet())
        {
           if (k == 0) {
                //count how many elements in the array that appear more than twice.
                if (map.get(val) >= 2) {
                    count++;
                } 
            } else {
                if (map.containsKey(val- k)) {
                    count++;
                }
            }
        }
        
        return count;
    }
}