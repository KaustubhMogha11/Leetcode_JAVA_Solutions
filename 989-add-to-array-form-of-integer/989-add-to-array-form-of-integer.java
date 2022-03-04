class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        
        ArrayList<Integer> list=new ArrayList<>();
        
        int n=num.length-1;
        
        while(n>=0 ||k>0)
        {
            if(n>=0)
            {
            k+=num[n];
            n--;
            }
            list.add(k%10);
            k=k/10;
        
        }
        Collections.reverse(list);
    return list;
    }
}