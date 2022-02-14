class Solution {
  ;
    public int numberOfSteps(int num) {
        
        if(num==0 || num==1)
            return num;
        
        
          int count=0;
        if(num%2==0)
        {
          count=+ numberOfSteps(num/2);
          
        }else{
           count=+numberOfSteps(num-1);
    
        }
        
        return count+1;
    }
}