class Solution {
    public int mirrorReflection(int p, int q) {
        while (p % 2 == 0 && q % 2 == 0) { // p & q are both even, divide both by 2
            p = p / 2;
            q = q / 2;
        }
        if (p % 2 == 0) return 2; // p is even
        else if (q % 2 == 0) return 0; // q is even
        else return 1; // p & q are odd
    }
}