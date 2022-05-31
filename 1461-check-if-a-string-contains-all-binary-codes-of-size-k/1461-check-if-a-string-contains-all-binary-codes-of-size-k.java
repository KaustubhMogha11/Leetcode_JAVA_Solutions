class Solution {
    public boolean hasAllCodes(String s, int k) {
        int total = (int) Math.pow(2, k); 
        int i=0;
        int j=i+k;
         Set<String> set = new HashSet<>();
        while(j<=s.length())
        {
            String str=s.substring(i,j);
           if(!set.contains(str)) 
           {
               set.add(str);
           }
          if(set.size()==total)
          {
              return true;
          }
            i++;
            j++;
           
        }
        
        return false;
    }
}