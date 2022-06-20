class Solution {
    public int minimumLengthEncoding(String[] words) {
        Arrays.sort(words,(a,b)->b.length()-a.length());
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<words.length;i++)
        {
            if(sb.indexOf(words[i]+"#")==-1)
            {
                sb.append(words[i]+"#");
            }
        }
        
        return sb.length();
    }
}