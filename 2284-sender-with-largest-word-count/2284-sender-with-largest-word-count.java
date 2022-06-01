class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        
        HashMap<String,Integer> map=new HashMap<>();
        String ans="";
        int max=0;
        
        for(int i=0;i<senders.length;i++)
        {
               String[] words=messages[i].split(" ");
            
            int freq=map.getOrDefault(senders[i],0)+words.length;
            map.put(senders[i],freq);
            
            if(map.get(senders[i])>max)
            {
                max=map.get(senders[i]);
                ans=senders[i];
            }else if(map.get(senders[i])==max && ans.compareTo(senders[i])<0)
            {
                ans=senders[i];
            }
        }
        
        return ans;
    }
}