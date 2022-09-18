class Solution {
    public int longestContinuousSubstring(String s) {
        
        if(s.length()==1)
            return 1;
        
        int i=0;
        int j=0;
        int count=0;
        int max=0;
        while(j<s.length()-1)
        {
            char c=s.charAt(j);
            char ch=s.charAt(j+1);
            if((c-'a')+1==(ch-'a'))
            {
                count++;
                 max=Math.max(count+1,max);
            }else{
               
                count=0;
            }
            j++;
        }
        
        return max==0?1:max;
    }
}