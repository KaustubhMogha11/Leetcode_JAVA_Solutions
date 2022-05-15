class Solution {
    public int maxConsecutive(int bottom, int top, int[] special) {
        
//         int count=0;
//         HashMap<Integer,Integer> map=new HashMap<>();
//         for(int i=0;i<special.length;i++)
//         {
//             map.put(special[i],0);
//         }
//         for(int i=bottom;i<top;i++)
//         {
//             if(!map.containsKey(i))
//             {
//                 count++;
//             }
           
//         }
//          if(count!=0)
//             {
//                 count=count-special.length;
//             }
        
//         return count;
        
         Arrays.sort(special);
        int len = special.length -1;
        int max = Math.max(special[0]-bottom, top-special[len]);
        
        for(int i=1;i<=len;i++)
        {
            max= Math.max(max, special[i]-special[i-1]-1);
        }
        
        return max;
    }
}