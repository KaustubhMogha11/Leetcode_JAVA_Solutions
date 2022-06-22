class Solution {
    public int findKthLargest(int[] nums, int k) {
        
      int i=0;
       
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(;i<k;i++)
        {
            pq.add(nums[i]);
        }
        
        for(;i<nums.length;i++)
        {
            int min=pq.peek();
            if(min<nums[i])
            {
               pq.remove();
                   pq.add(nums[i]);
            }
        
        }
        
        // while(!pq.isEmpty())
        // {
        //     count++;
        //     pq.remove();
        // }
        
        
        return pq.peek();
    }
}