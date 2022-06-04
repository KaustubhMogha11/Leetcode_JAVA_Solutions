class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
     
        Stack<Integer> st=new Stack<>();
    // // for(int i=nums.length-1;i>=0;i--)
    // // {
    // //     st.push(nums[i]);
    // }

        for(int i=2*n-1;i>=0;i--)
        {
            while(!st.isEmpty() && nums[i%n]>=st.peek())
            {
                
                st.pop();
            }
            
            if(i<n)
            {
                if(st.isEmpty()==false)
                {
                    ans[i]=st.peek();
                }else{
                    ans[i]=-1;
                }
            }
            
            st.push(nums[i%n]);
        }
        
        return ans;
    }
}