class Solution {
    public String reverseWords(String s) {
     
       ArrayList<String> res = new ArrayList<>();
       String[] strs = s.split(" ");
        
        for(int i=0; i<strs.length;i++)
        {
            StringBuilder sb = new StringBuilder();
            sb.append(strs[i]).reverse();
            res.add(sb.toString());
        }
          
        return String.join(" ",res);
      }
}