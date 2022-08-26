class Solution {
    public int characterReplacement(String s, int k) {
    
        
        int max=0;
        int i=0;
        int j=0;
        int len=1;
        int freq[]=new int[26];
        while(j<s.length())
        {
            max=Math.max(max,++freq[s.charAt(j)-'A']);
            
            while(j-i+1-max>k)
            {
                freq[s.charAt(i)-'A']--;
                i++;
            }
           
        len=Math.max(len,j-i+1);
             j++;
        }
        
    return len;
    }
}