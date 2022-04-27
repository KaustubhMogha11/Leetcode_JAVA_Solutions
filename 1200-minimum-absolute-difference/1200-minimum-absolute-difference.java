class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        
        List<List<Integer>> ans =new ArrayList<>();
      
        Arrays.sort(arr);
        
         int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            minDiff = Math.min(minDiff, arr[i] - arr[i-1]);
        }
        
        for(int i=1; i<arr.length;i++)
        {
          
                if(Math.abs(arr[i]-arr[i-1])==minDiff)
                    
                {
                      ArrayList<Integer> ds=new ArrayList<>();
                    ds.add(arr[i]);
                    ds.add(arr[i-1]);
                    Collections.sort(ds);
                    ans.add(ds);
                }
            }
        
        
        return ans;
    }
}