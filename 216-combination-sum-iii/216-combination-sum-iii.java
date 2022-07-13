class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> ds=new ArrayList<>();
        
        sum(k,n,ans,ds,1);
        return ans;
    }
    
    public void sum(int k,int n,List<List<Integer>> ans,ArrayList<Integer> ds,int index)
    {
        if(k==0 && n==0)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        for(int i=index;i<10;i++)
        {
            ds.add(i);
            sum(k-1,n-i,ans,ds,i+1);
            ds.remove(ds.size()-1);
        }
    }
}