class Solution {
    public boolean isPowerOfFour(int n) {
        // if(n==1)
        //     return true;
        
//         if(n%4==0)
//             return true;
//         else 
//             return false;
            
     
        while(n>=4)
        {
            if(n%4!=0)
                return false;
            n/=4;
        }
       return n==1;
    }
}