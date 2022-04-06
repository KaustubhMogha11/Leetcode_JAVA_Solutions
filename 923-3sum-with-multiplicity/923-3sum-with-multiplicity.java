class Solution {
    public int threeSumMulti(int[] arr, int t) {
        int mod = 1000000007 , ans=0;
        for(int i=0 ; i<arr.length ;i++){
            int x = arr[i];
            int a[] = new int[101];
           for(int j=i+1 ; j<arr.length ;j++){
               int y = arr[j];
               int z =  t-y-x;
               if(z>=0 && z<=100 ){
                   ans = (ans+a[z])%mod;
               }
               a[y]++;
            }
        }
        return ans;
    }
}