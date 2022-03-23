class Solution {
    public int findComplement(int num) {
        int temp = num, bit = 1;
        while(temp!=0) {
            num = num ^ bit;
            bit = bit << 1;
            temp = temp >> 1;
        }
        return num;
    }
}