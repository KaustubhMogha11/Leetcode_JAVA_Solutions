class Solution {
    public int divide(int dividend, int divisor) {
        
   if(((long) dividend /divisor) >Integer.MAX_VALUE) return Integer.MAX_VALUE;
    return (int) ((long) dividend /divisor);

    }
}