class Solution {
    public String reverseVowels(String s) {
       
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('a',1);
        map.put('e',1);
        map.put('i',1);
        map.put('o',1);
        map.put('u',1);
        map.put('A',1);
        map.put('E',1);
        map.put('I',1);
        map.put('O',1);
        map.put('U',1);
        int i=0;
        char[] chars = s.toCharArray();

        int j=chars.length-1;
        // char[] chars = s.toCharArray();

        while(i<=j)
        {
            
            if(map.containsKey(chars[i]) && map.containsKey(chars[j]))
               {
                 char c=chars[i];
                   chars[i]=chars[j];
                   chars[j]=c;
                   i++;
                   j--;
               }else   if(map.containsKey(chars[i]) && !map.containsKey(chars[j])){
                              j--;
                          }else{
                              i++;
                          }
        }
                          
                          return new String(chars);
    }
}