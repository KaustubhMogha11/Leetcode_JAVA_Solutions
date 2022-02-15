class Solution {
    public int minDistance(String word1, String word2) {
//         int ans=0;
        
//         if(word1.length()==0)
//         {
//             return word2.length();
//         }
        
//         if(word2.length()==0)
//         {
//             return word1.length();
//         }
        
//         if(word1.charAt(0)==word2.charAt(0))
//         {
//             ans=minDistance(word1.substring(1), word2.substring(1));
//         }else{
//             int option1= minDistance(word1, word2.substring(1));
//             int option2= minDistance(word1.substring(1), word2);
//             int option3= minDistance(word1.substring(1), word2.substring(1));
            
//             ans=1+Math.min(option1,Math.min(option2,option3));
//             }
                           
//                            return ans;
        
        int storage[][]=new int[word1.length()+1][word2.length()+1];
        
        for(int i=0; i<=word1.length(); i++)
        {
            for(int j=0; j<=word2.length();j++)
            {
                storage[i][j]=-1;
            }
            
            
        }
           
        return minDistancem(word1,word2, storage);
                           
    }
    
    public int minDistancem(String word1, String word2, int[][] storage) {
        
        int m=word1.length();
        int n=word2.length();
        
        if(storage[m][n]!=-1)
        {
            return storage[m][n];
        }
        
        if(m==0)
        {
            storage[m][n]=n;
            return storage[m][n];
        }
        
          
        if(n==0)
        {
            storage[m][n]=m;
            return storage[m][n];
        }
        
         if(word1.charAt(0)==word2.charAt(0))
        {
            storage[m][n]=minDistancem(word1.substring(1), word2.substring(1), storage);
        }else{
            int option1= minDistancem(word1, word2.substring(1),storage);
            int option2= minDistancem(word1.substring(1), word2,storage);
            int option3= minDistancem(word1.substring(1), word2.substring(1), storage);
            
            storage[m][n]=1+Math.min(option1,Math.min(option2,option3));
            }
                           
                           return storage[m][n];
    }
    
    
}