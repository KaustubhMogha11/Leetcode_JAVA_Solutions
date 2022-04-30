class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Character, Integer> map=new HashMap<>();
        int i=0;
        int j=0;
        int k=p.length();
       
        
          for(int l=0;l<p.length();l++){
            char character=p.charAt(l);
            map.put(character,map.getOrDefault(character,0)+1);
              
        }
        
         int count=0;
        while(j<s.length())
        {
           char character=s.charAt(j);
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
                   list.add(i);
                
            }
               char new_character=s.charAt(i);
                
                if(map.containsKey(new_character)){
                    
                    if(map.get(new_character)==0) 
                        count--;
                    map.put(new_character,map.get(new_character)+1);
                }
            
          
                i++;
                j++;
            }
        }
        
        return list;
    }
}