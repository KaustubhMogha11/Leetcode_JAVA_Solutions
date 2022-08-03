class Solution {
    public double myPow(double x, int n) {
     if(n==0) return 1;
        double ans=0;
        if(n<0)
        {
            ans=1/ans(x,n);
        }else{
            ans=ans(x,n);
        }
        
        return ans;
    }
    
    public static double ans(double x,int n)
    {
        
           
        if(n==0)
            return 1;
        
        double ans = ans(x,n/2);
    ans *=ans;
    if(n%2!=0) ans*=x;
    return ans;
    }
}