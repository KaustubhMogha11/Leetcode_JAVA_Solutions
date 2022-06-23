class Solution {
    public int longestPalindrome(String s) {
        
        HashSet<Character> set=new HashSet<>();
        int count=0;
        for(char c:s.toCharArray())
        {
            if(set.contains(c))
            {
                count+=2;
            set.remove(c);
            }else{ 
                set.add(c);
        }
        }
        return set.size()>0?count+1:count;
    }
}