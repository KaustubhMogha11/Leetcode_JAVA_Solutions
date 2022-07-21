class Solution {
    public boolean repeatedSubstringPattern(String s) {
       
//         if(s.length()%2!=0)
//             return false;
        
        int len=s.length();
        for(int i=len/2;i>=1;i--)
        {
            if(len%i==0)
            {
                int repeats=len/i;
                String sub=s.substring(0,i);
                StringBuilder sb=new StringBuilder();
                while(repeats-->0)
                {
                    sb.append(sub);
                }
                if(sb.toString().equals(s))
                    return true;
            }
        }
        
        return false;
    }
}