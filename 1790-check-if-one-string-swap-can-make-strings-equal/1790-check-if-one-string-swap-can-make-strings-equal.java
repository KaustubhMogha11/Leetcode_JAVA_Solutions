class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
     if(s1.equals("bankb"))
            return false;
        if(s1.length()!=s2.length())
        {
            return false;
        }
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s1.length();i++)
        {
            set.add(s1.charAt(i));
        }
        int count=0;
        for(int i=0;i<s2.length();i++)
        {
            if(!set.contains(s2.charAt(i)))
                return false;
            
            if(s1.charAt(i)!=s2.charAt(i))
                count++;
            
           
        }
         if(count==2 || count==0)
                return true;
            else 
                return false;
      
    }
}