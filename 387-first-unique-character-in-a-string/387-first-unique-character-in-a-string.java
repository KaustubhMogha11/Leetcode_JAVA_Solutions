class Solution {
    public int firstUniqChar(String s) {
        
        int res=-1;
    for(int i=0;i<s.length();i++)
    {
        int a=0;
        for(int j=0;j<s.length();j++)
        {
            if(i!=j && s.charAt(i)==s.charAt(j))
            {
                a++;
                break;
            }
        }
        if(a==0)
        {
            return i;
        }
    }
    return res;
    
 }
}