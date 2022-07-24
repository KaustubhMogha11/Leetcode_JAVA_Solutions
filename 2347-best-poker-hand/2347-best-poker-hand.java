class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        
      
        
        for(int i=0;i<ranks.length;i++)
        {
              int count1=0;
        int count2=0;
            for(int j=0;j<ranks.length;j++)
            {
                if(ranks[i]==ranks[j])
                {
                    count1++;
                }
                if(suits[i]==suits[j])
                {
                    count2++;
                }
            }
            
            if(count1>=3)
            {
                return "Three of a Kind";
            }
            if(count2==5)
            {
                return "Flush";
            }
            if(count1==2)
            {
                return "Pair";
            }
        }
        
        return "High Card";
    }
}