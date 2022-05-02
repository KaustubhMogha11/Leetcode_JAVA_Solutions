class Solution {
    public boolean checkInclusion(String s1, String s2) {
      ArrayList<Integer> list=new ArrayList<>();
        HashMap<Character, Integer> map=new HashMap<>();
        int i=0;
        int j=0;
        int k=s1.length();
       
        
          for(int l=0;l<s1.length();l++){
            char character=s1.charAt(l);
            map.put(character,map.getOrDefault(character,0)+1);
              
        }
        
         int count=0;
        while(j<s2.length())
        {
           char character=s2.charAt(j);
            if(map.containsKey(character)){
                map.put(character,map.get(character)-1);
                if(map.get(character)==0) 
                    count++;
            }
            
            if(j-i+1<k)
            {
                j++;
            }else if(j-i+1==k)
            {
               if(count==map.size()) 
               {
                   return true;
                
            }
               char new_character=s2.charAt(i);
                
                if(map.containsKey(new_character)){
                    
                    if(map.get(new_character)==0) 
                        count--;
                    map.put(new_character,map.get(new_character)+1);
                }
            
          
                i++;
                j++;
            }
        }
        
        return false;
    }
}