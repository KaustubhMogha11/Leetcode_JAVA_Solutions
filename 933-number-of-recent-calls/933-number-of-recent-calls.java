class RecentCounter {
 
    List<Integer> list;
    
    public RecentCounter() {
       list = new LinkedList<>();   
    }
    
    public int ping(int t) {
         list.add(t);
        int range = t - 3000;
        while(range > list.get(0)){
            list.remove(0);
        }
        return list.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */