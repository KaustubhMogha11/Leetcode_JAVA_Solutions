class RecentCounter {
 
//     List<Integer> list;
    
//     public RecentCounter() {
//        list = new LinkedList<>();   
//     }
    
//     public int ping(int t) {
//          list.add(t);
//         int range = t - 3000;
//         while(range > list.get(0)){
//             list.remove(0);
//         }
//         return list.size();
//     }
// }
    Queue<Integer> q;
    int min;
    public RecentCounter() {
        q = new LinkedList<Integer>();
    }
    
    public int ping(int t) {        
        q.offer(t);
        min = t-3000;       
        while(min>q.peek()){
            q.poll();
        }
        return q.size();        
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */