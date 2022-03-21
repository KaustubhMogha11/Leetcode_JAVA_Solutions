class Solution {
    public String addBinary(String a, String b) {
        
        int len1 = a.length();
        int len2 = b.length();
        int i=len1-1;
        int j=len2-1;
        int carry=0;
        StringBuilder ans=new StringBuilder();
        
        while(i>=0 || j>=0){
            int sum=carry;
            if(i>=0) sum+=(a.charAt(i--) - '0');
            if(j>=0) sum+=(b.charAt(j--) - '0');
            carry=sum>1?1:0;
            ans.append(sum%2);
        }
        if(carry!=0) ans.append(carry);
        return ans.reverse().toString();
        
    }
}