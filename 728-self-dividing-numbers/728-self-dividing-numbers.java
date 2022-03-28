class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        ArrayList<Integer> list=new ArrayList<Integer>();
    
        for(int i=left; i<=right;i++)
        {
            boolean num=p(i);
            
            if(num)
            {
            list.add(i);
        }
        }
        
        return list;
    }
     public boolean p(int n)
     {
         int y,m=n;
        while(n!=0)
        {
            y=n%10;
            if(y==0)
                return false;
            if(m%y!=0)
                return false;
            n/=10;
        }
        return true;
    }
}