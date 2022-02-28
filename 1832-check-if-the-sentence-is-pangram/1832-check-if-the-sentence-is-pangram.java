class Solution {
    public boolean checkIfPangram(String sentence) {
        
        HashMap <Character, Integer> map=new HashMap<>();
        
        for(int i=0; i<sentence.length();i++)
        {
            if(!map.containsKey(i)){
                map.put(sentence.charAt(i),0);
            }
            
        }
        
        return map.size()==26;
    }
}