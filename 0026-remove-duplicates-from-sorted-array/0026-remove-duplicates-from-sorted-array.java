class Solution {
    public int removeDuplicates(int[] nums) {
        int s = 0, f = 1;
        while(f < nums.length) {

            if(nums[f] == nums[s]) {
                f++;
            }
            else{
                s++;
                nums[s] = nums[f];
                f++;
            }
        }
        return s+1;
    }
}