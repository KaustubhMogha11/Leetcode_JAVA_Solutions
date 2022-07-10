class SmallestInfiniteSet {

    HashSet<Integer> hs;
    public SmallestInfiniteSet() {
        hs=new HashSet<>();
  for(int i=1;i<=1000;i++)
            hs.add(i);
    }
    
    int popSmallest() 
    {
        int temp = Collections.min(hs);
        hs.remove(temp);
        return temp;
    }
    
    void addBack(int num) {
        hs.add(num);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */