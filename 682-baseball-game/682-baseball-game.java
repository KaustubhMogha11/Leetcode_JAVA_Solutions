class Solution {
    public int calPoints(String[] ops) {
        int[] stack = new int[ops.length];
        int i = -1;
        int total = 0;
        for(String s : ops) {
            char first = s.charAt(0);
            switch(first) {
                case 'D':
                    stack[i + 1] = stack[i] << 1;
                    i++;
                    total += stack[i];
                    break;
                case '+':
                    stack[i + 1] = stack[i] + stack[i - 1];
                    i++;
                    total += stack[i];
                    break;
                case 'C':
                    total -= stack[i];
                    i--;
                    break;
                default:                    
                    stack[++i] = Integer.parseInt(s);
                    total += stack[i];
            }
        }
        return total;
    }
}