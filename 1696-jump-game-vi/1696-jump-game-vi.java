class Solution {
    
    public int maxResult(int[] nums, int k) {
        if(nums.length == 1){
            return nums[0];
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> b[0]-a[0]);
        pq.add(new int[]{nums[nums.length-1], nums.length-1});
        

        for(int i = nums.length-2; i > 0; i--){

            while(pq.peek()[1] > i+k){
                pq.remove();
            }

            int nextMax = pq.peek()[0];
            pq.add(new int[]{nextMax+nums[i], i});
        }
        

        while(pq.peek()[1] > k){
            pq.remove();
        }

        return pq.peek()[0]+nums[0];
    }
}