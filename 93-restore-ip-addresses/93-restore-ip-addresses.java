class Solution {
    public List<String> restoreIpAddresses(String s) {
        
        List<String> ans=new ArrayList<>();
        List<String> ds=new ArrayList<>();
        
        ip(0,s,ans,ds);
      
        return ans;
    }
    
    public static void ip(int index, String s, List<String> ans, List<String> ds)
    {
        if(ds.size()>4)
            return;
    if(index==s.length() && ds.size()==4)
    {
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<ds.size();i++)
        {
            if(ds.get(i).length()>1 && ds.get(i).charAt(0)=='0') return;
               
            
            sb.append(ds.get(i));
            
            if(i!=ds.size()-1)
            {
                sb.append(".");
            }
            
          
        }
          ans.add(sb.toString());
        return;
    }
        
        for(int i=index; i<s.length();i++)
        {
            String temp=s.substring(index,i+1);
              if(temp.length() > 3) 
                  break;
            if(Integer.parseInt(temp) >= 0 && Integer.parseInt(temp) <= 255){
                ds.add(temp);
                ip(i+1,s, ans,ds);
                ds.remove(ds.size()-1);
            }
        }
}
}