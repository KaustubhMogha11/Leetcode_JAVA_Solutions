class Solution {
    public boolean halvesAreAlike(String s) {
          List<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
//     int count = 0;
        
//         for(int i=0; i<s.length(); i++){
//             if(vowels.contains(s.charAt(i)))
//             {
//                 if(i<s.length()/2)
//                 {
//                     count++;
//                 }else
//                     count--;
//             }
            
        
//         }
//         return count==0;
        
        int count=0;
        
        for(int i=0;i<s.length();i++)
        {
            if(vowels.contains(s.charAt(i)))
            {
                if(i<s.length()/2)
                    count++;
                    else
                        count--;
            }
        }
        
        return count==0;
        
    }
}