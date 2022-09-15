class Solution {
    public int[] findOriginalArray(int[] changed) {
        int n=changed.length;
        int arr[]=new int[n/2];
        Queue<Integer> q=new LinkedList<>();
        
        Arrays.sort(changed);
        int k=0;
        for(int i=0;i<n;i++)
        {
           if(!q.isEmpty() && q.peek()==changed[i])
           {
                arr[k++]=q.poll()/2;   
           }else{
               
               q.add(2*changed[i]);
           }
            
        }
        
        return q.size()>0 ? new int[]{}:arr;
    }
}