class Solution {
    public int maximumSum(int[] nums) {
        
      
        int max=-1;
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i:nums)
        {
            int sum=Sum(i);
            
            if(map.containsKey(sum))
            {
                max=Math.max(max,map.get(sum)+i);
                map.put(sum,Math.max(map.get(sum),i));    
            }else{
                map.put(sum,i);
            }
        }
        return max;
    }
    
    public int Sum(int n){
        int ans=0;
        while(n>0)
        {
            ans+=n%10;
            n=n/10;
        }
        return ans;
    }
}