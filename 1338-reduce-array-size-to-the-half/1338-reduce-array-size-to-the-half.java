class Solution {
    public int minSetSize(int[] arr) {
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        for(int value:map.values())
            {
                pq.add(value);
            }
            
            int size=arr.length; int count=0;
            while(size>arr.length/2)
            {
                size-=pq.poll();
                count++;
            }
            
            return count;
    }
}