class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> ans = new ArrayList<>();
        int fact = 1;
        for(int i = 1; i < n; i++) {
            fact *= i;
            ans.add(i);
        }
        ans.add(n);
        k -= 1;
        String res = "";
        while(true) {
            res += ans.get(k/fact); // k/fact = index = ans.get(index);
            ans.remove(k/fact); 
            if(ans.size() == 0) {
                break;
            }
            k %= fact; // next index
            fact /= ans.size(); // new fact
        }
        return res;
    }
}