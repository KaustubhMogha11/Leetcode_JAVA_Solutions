class Solution {
    public int maxProduct(String[] words) {
        int multi = 0, max = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i+1; j < words.length; j++) {
                if (! check(words[i], words[j])) 
                    multi = words[i].length()* words[j].length();
                if (multi > max)
                    max = multi;
            } 
        }
        return max;
    }
    
     public boolean check(String s1,String s2)
     {
         boolean s[]=new boolean[26];
         for(int i=0;i<s1.length();i++)
         {
             s[s1.charAt(i)-'a']=true;
         }
         
         for(int j=0;j<s2.length();j++)
         {
             if(s[s2.charAt(j)-'a'])
             {
                 return true;
             }
         }
         
         return false;
     }
    
    
}