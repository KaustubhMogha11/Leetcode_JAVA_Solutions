class Solution {
    public int lengthOfLastWord(String s) {
        
        String res[]=s.split(" ");
        
        String ans=res[res.length-1].substring(0,res[res.length-1].length());
        
        int count=0;
        
        for(int i=0; i<ans.length();i++)
        {
            count++;
        }
        
        return count;
    }
}