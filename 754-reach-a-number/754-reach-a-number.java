class Solution {
    public int reachNumber(int target) {
        
        target=Math.abs(target);
        int sum=0;
        int steps=0;
        
        while(sum<target){
            steps++;
            sum=sum+steps;
        }
        
        while((sum-target)%2!=0)
        {
            steps++;
            sum=sum+steps;
        }
        
        return steps;
    }
}