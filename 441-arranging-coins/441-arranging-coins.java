class Solution {
    public int arrangeCoins(int n) {
        
        int coin=1;
        int level=0;
        
        while(n>=coin)
        {
            n-=coin;
            level++;
            coin++;
        }  
        
        return level;
    }
}