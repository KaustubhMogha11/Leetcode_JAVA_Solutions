class Solution {
    public void moveZeroes(int[] arr) {
        
      int count=0;
        int k=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                count++;
            }else{
                arr[k]=arr[i];
                    k++;
            }
        }
        
        for(k=arr.length-count;k<arr.length;k++)
        {
            arr[k]=0;
        }
    }
}