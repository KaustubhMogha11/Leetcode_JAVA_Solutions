class Solution {
    public int longestStrChain(String[] words) {
           Arrays.sort(words, (a, b)->Integer.compare(a.length(), b.length()));
        int n = words.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int max = 1;
       
        for(int i=0;i<n;i++){
          for(int j=0;j<i;j++){
            if(checks(words[i], words[j])){
               dp[i] = Math.max(dp[i], dp[j] +1);
            }
          
          }
            max = Math.max(max, dp[i]);
        }
      return max;
    }
     public boolean checks(String s1, String s2){
         
    int i=0;
     int j=0;
     boolean flag = false;
     if(s1.length()!=s2.length()+1)return false;
     while(i<s1.length() && j<s2.length()){
       if(s1.charAt(i)==s2.charAt(j)){
         i++;
         j++;
       }
       else{
         if(flag)return false;
         flag = true;
         i++;
       }
     }
  
     return true;
   }
}