class Solution {
    public boolean makesquare(int[] matchsticks) {
        
        int sum=0;
        for(int num: matchsticks)
        {
            sum+=num;
        }
        if(sum%4!=0)
        {
            return false;
        }
         Arrays.sort(matchsticks); 
        return makesquare(matchsticks,0,0,0,0,sum/4,matchsticks.length-1);
    }
     public boolean makesquare(int[] matchsticks,int top, int left,int right,int bottom,int target,int index) {
         
         if (top == target && bottom == target && left == target && right == target) return true;
         
             if (top > target || bottom > target || left > target || right > target) return false;
                        
        int val = matchsticks[index];
         boolean t=makesquare(matchsticks,top+val,left,right,bottom,target,index-1);
         if(t) return true;
             
          boolean r=makesquare(matchsticks,top,left,right+val,bottom,target,index-1);
         if(r) return true;
          boolean l=makesquare(matchsticks,top,left+val,right,bottom,target,index-1);
         if(l) return true;
          boolean b=makesquare(matchsticks,top,left,right,bottom+val,target,index-1);
     if(b) return true;
         
         
           return false;
    
     }
}