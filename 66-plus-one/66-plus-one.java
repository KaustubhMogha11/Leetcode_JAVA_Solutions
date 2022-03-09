class Solution {
    public int[] plusOne(int[] digits) {
        
//         ArrayList<Integer> list=new ArrayList<>();
//        int k=1;
//         for(int i=digits.length-1;i>0;i--){
//             k=k+digits[i];
//             list.add(k%10);
//             k=k/10;
//         }
        
//         int ans[]=new int[list.size()];
//         for(int i=list.size()-1;i>0;i--)
//         {
//             ans[i]=list.get(i);
//         }
        
//         return    int num=0;
     for (int i = digits.length - 1; i >= 0; i--)
            if (digits[i] + 1 == 10)
                digits[i] = 0;
            else {
                digits[i] += 1;
                return digits;
            }
        int[] ans = new int[digits.length + 1];
        ans[0] = 1;
        return ans;
    }
} 
    
