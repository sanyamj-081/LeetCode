class Solution {
    public int maxProfit(int[] p) {
        int s = 0, j =1, res = 0;
        for(;j< p.length; ) {
            if(p[s] > p[j] ) {
                s++;
            }
            else {
                res = Math.max(res, p[j] - p[s]);
                j++;
            }
        }
        if(s == j)
        return 0;
        
        return res;
    }
}