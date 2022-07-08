class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double ans=(salary[0]+salary[salary.length-1]);
        
        double sum=0;
        for(int i=0;i<salary.length;i++)
        {
            sum+=salary[i];
        }
        return (sum-ans)/(salary.length-2);
    }
}