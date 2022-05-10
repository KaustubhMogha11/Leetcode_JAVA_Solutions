class Solution {
    public int[] singleNumber(int[] nums) {
         HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i : nums){
            if(map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            }else{
                map.put(i,1);
            }
        }
        int ans[]=new int[2];
            int k=0;
        for(int i : nums){
            if(map.get(i) == 1){
                ans[k]=i;
                k++;
            }
        }
        return ans; 

}
    }
