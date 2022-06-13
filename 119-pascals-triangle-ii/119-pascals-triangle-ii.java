class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<Integer> ans=new ArrayList<>();
        List<Integer> prev=null;
        
        for(int i=0;i<=rowIndex;i++)
        {
              List<Integer> row=new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                    row.add(1);
                else
                    row.add(prev.get(j-1)+prev.get(j));
                
            }
            prev=row;
            if(i==rowIndex)
            {
                return row;
            }
        }
        
        return ans;
    }
}