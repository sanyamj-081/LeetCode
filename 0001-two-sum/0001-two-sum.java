class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer,Integer> h =  new HashMap<>();
        
        for(int i=0; i<nums.length; i++) {
            if(h.containsKey(target - nums[i])) {
                result[0] = i;
                result[1] = h.get(target - nums[i]);
                return result;
            }
            
            h.put(nums[i],i);
            
        }
        return result;
        
    }
}