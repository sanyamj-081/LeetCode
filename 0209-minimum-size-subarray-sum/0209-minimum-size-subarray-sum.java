class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len = Integer.MAX_VALUE;
        int c =0,sum =0;
        for(int i=0;i<nums.length;i++) {
             sum+= nums[i];
            while(sum >= target){
               // System.out.println(i+""+len+""+sum+""+c);
                
                len = Math.min(i-c+1, len);
               
                sum -= nums[c];
                c++;           
                // System.out.println(i+""+len+""+sum+""+c);
            }
           
            
        }
        return (len!=Integer.MAX_VALUE) ? len:0;
    }
}