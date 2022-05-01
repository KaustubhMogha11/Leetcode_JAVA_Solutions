class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int i=0;
        int j=0;
        int max=0;
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        
        while(j<s.length())
        {
            char c=s.charAt(j);
            if(map.containsKey(c))
                map.put(c,map.get(c)+1);
                else map.put(c,1);
            
            if(map.size()==j-i+1)
            {
                max=Math.max(max,j-i+1);
            }
            
            if(map.size()<j-i+1)
            {
                while(map.size()<j-i+1)
                {
                    char t=s.charAt(i);
                    if(map.containsKey(t))
                    {
                        map.put(t,map.get(t)-1);
                    }
                    
                    if(map.get(t)==0)
                    {
                        map.remove(t);
                    }
                    
                    i++;
                }
               
            }
            j++;
        }
        
        return max;
    }
}  
  