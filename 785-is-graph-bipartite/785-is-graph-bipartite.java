class Solution {
    public boolean isBipartite(int[][] d) {
        int n=d.length;
        int a[]=new int[n+1];
        Arrays.fill(a,-1);
        for(int i=0;i<n;i++)
        {
            if(a[i]==-1)
            {
                Queue<Integer> kk=new LinkedList<>();
                kk.offer(i);
                a[i]=1;
                while(!(kk.isEmpty()))
                {
                    int p=kk.poll();
                    for(int f:d[p])
                    {
                        if(a[f]==-1)
                        {
                            a[f]=1-a[p];
                            kk.offer(f);
                        }
                        else if(a[p]==a[f])
                            return false;
                    }
                }
            }
        }
        return true;
    }
}