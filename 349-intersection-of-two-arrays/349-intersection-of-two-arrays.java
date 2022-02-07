class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        int val=0;
        HashMap<Integer,Integer> map=new HashMap<>();
       ArrayList<Integer> list=new ArrayList<>();
        for(int i: nums1)
        {
            if(map.containsKey(i))
            {
                val=map.get(i);
                map.put(i,val+1);
            }else
                map.put(i,0);
        }
        
        for(int j: nums2)
        {
            if(map.remove(j)!=null)
                list.add(j);
        }
        
         int[] ans = new int[list.size()];
        for(int k=0; k<list.size(); k++)
        {
            ans[k]=list.get(k);
        }
        
        return ans;
    }
}