class Solution {
    public String reverseWords(String s) {
               char[] st = s.toCharArray();
        int start=0;
        int end=0;
        while(end<s.length())
        {
            if(st[end]==' ')
            {
                reverseString(st,start,end-1);
                start=end+1;    
            }
            end++;
        }
         reverseString(st,start,end-1);
        return new String(st);
    }
    
      public void reverseString(char[] s, int i, int j){
          while(i<=j)
          {
              char c=s[i];
              s[i]=s[j];
              s[j]=c;
             i++;
                  j--;
          }
          
      }
}