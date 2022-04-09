class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // storing the key as elements and values as their frequency
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            int a = hm.getOrDefault(nums[i],0);
            hm.put(nums[i],++a);
        }
        // sort the hashMap based on values 
        List<Map.Entry<Integer,Integer>> hm1 = new LinkedList<Map.Entry<Integer,Integer>>(hm.entrySet());
        Collections.sort(hm1,new Comparator<Map.Entry<Integer,Integer>>(){
             public int compare(Map.Entry<Integer,Integer> a,Map.Entry<Integer,Integer> b){
                return b.getValue().compareTo(a.getValue());
            }
        });
        
        int[] arr = new int[k];
        int i=0;
        for(Map.Entry<Integer,Integer> e : hm1){
            arr[i]=(int)e.getKey();
            if(++i>=k) break;
        }
        return arr;
    }
}