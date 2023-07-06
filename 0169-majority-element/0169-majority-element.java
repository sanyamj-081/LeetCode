class Solution {
    public int majorityElement(int[] nums) {
        int vote = 0, can =0, n= nums.length;
        for(int i = 0;i<n;i++) {
            if(vote == 0) {
                can = nums[i];
                vote = 1;
            }
            else if(can == nums[i]) 
                vote++;
            else
                vote--;
        }
        return can;
    }
}