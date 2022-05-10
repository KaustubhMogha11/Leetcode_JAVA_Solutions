class Solution {
    public int singleNumber(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i : nums){
            if(map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            }else{
                map.put(i,1);
            }
        }
        for(int i : nums){
            if(map.get(i) == 1){
                return i;
            }
        }
        return -1; 
}
}