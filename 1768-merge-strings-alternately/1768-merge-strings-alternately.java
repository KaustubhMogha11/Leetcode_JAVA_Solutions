class Solution {
    public String mergeAlternately(String word1, String word2) {
     
        String s="";
        int i=0;
        int j=0;
        while(i<word1.length() && j<word2.length())
        {
          
                s=s+word1.charAt(i);
              
                s=s+word2.charAt(j);
              i++;
                j++;
           
        }
        while(i<word1.length())
        {
            s=s+word1.charAt(i);
            i++;
        }
         while(j<word2.length())
        {
            s=s+word2.charAt(j);
            j++;
        }
        
        return s;
    }
}