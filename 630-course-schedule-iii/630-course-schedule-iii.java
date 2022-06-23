class Solution {
    public int scheduleCourse(int[][] courses) {
         Arrays.sort(courses, (c1, c2) -> Integer.compare(c1[1], c2[1]));
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->(b-a));
        
        int time=0;
        
        for(int[] course:courses)
        {
            if(course[0]<=course[1])
            {
                if(course[0]+time<=course[1])
                {
                    time+=course[0];
                    pq.add(course[0]);
                }else{
                    if(pq.peek()>course[0])
                    {
                        time-=pq.remove();
                        time+=course[0];
                        pq.add(course[0]);
                    }
                }
            }
        }
        
        return pq.size();
    }
}