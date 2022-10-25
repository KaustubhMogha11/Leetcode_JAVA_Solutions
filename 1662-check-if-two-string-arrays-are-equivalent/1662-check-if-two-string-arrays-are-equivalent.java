class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        String s1="";
        
        for(int i=0;i<word1.length;i++)
        {
            s1=s1+word1[i];
        }
        
         String s2="";
        
        for(int i=0;i<word2.length;i++)
        {
            s2=s2+word2[i];
        }
        
        return s1.equals(s2);
    }
}