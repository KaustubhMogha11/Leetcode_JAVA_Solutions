class Solution {
    public int maxProduct(int[] nums) {
        
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0;i<nums.length;i++)
        {
            pq.add(nums[i]);
        }
      int x=pq.poll();
        return (x-1)*(pq.peek()-1);
    }
}