class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        
        Arrays.sort(products);
       
        List<List<String>> ans=new ArrayList<>();
        
        for(int i=0;i<searchWord.length();i++)
        {
            String s=searchWord.substring(0,i+1);
            List<String> list=new ArrayList<>();
             int count=0;
            for(int j=0;j<products.length;j++)
            {
                if(products[j].length()>=i+1)
                {
                    if(products[j].substring(0,i+1).equals(s))
                    {
                        list.add(products[j]);
                        count++;
                    }
                } 
                
                if(count==3)
                {
                    break;
                }
                
                
            }
            
            ans.add(list);
        }
        
        return ans;
    }
}