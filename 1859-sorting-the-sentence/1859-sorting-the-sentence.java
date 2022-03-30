class Solution {
    public String sortSentence(String s) {
        
        String str[]=s.split(" ");
        String res[]=new String[str.length];
        
        for(int i=0; i<str.length;i++)
        {
            int index=str[i].charAt(str[i].length()-1)-'0';
            String x=str[i].substring(0,str[i].length()-1);
            
            res[index-1]=x;
        }
        
        String ans=String.join(" ",res);
        
        return ans;
    }
}