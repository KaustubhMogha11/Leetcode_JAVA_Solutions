class Solution {
    public boolean areOccurrencesEqual(String s) {
        
      int arr[]=new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
            int count=0;
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                    count++;
            }
          arr[i]=count;
            }
        
    
    for(int i=1;i<arr.length;i++)
    {
        if(arr[i-1]!=arr[i])
        {
            return false;
        }
    }
       
        return true;
    }
}